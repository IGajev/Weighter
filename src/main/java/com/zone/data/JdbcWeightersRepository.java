package com.zone.data;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import com.zone.entities.Weighter;
import com.zone.exceptions.WeightersException;

@Repository
public class JdbcWeightersRepository implements WeightersRepository {

	private JdbcOperations jdbcOperations;
	
	private final String SQL_INSERT_MALE_WEIGHTER = "insert into weighters (wrist, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?)";
	private final String SQL_INSERT_FEMALE_WEIGHTER = "insert into weighters (height, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?)";
	private final String SQL_CHECK_IF_WEIGHTER_EXISTS = "select count(*) from weighters where username = ?";
	private final String SQL_GET_WEIGHTER_BY_USERNAME = "select * from weighters where username = ?";
	
	@Inject
	public JdbcWeightersRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	@Override
	public void saveWeighter(Weighter weighter) throws WeightersException {
		
		if ( (weighter.getSex() != null) && ( weighter.getSex().equals("male")) )  {
			jdbcOperations.update(SQL_INSERT_MALE_WEIGHTER,
					weighter.getWrist(),
					weighter.getSportFactor(),
					weighter.getSex(),
					weighter.getFirstName(),
					weighter.getLastName(),
					weighter.getUsername(),
					weighter.getPassword()
					);
		} else if ( (weighter.getSex() != null) && (weighter.getSex().equals("female")) ) {
			jdbcOperations.update(SQL_INSERT_FEMALE_WEIGHTER,
					weighter.getHeight(),
					weighter.getSportFactor(),
					weighter.getSex(),
					weighter.getFirstName(),
					weighter.getLastName(),
					weighter.getUsername(),
					weighter.getPassword()
					);
		} else {
			throw new WeightersException();
		}
			
	}

	@Override
	public Weighter retrieveWeighter(String username) {
		Weighter weighter = jdbcOperations.queryForObject(SQL_GET_WEIGHTER_BY_USERNAME, (rs, rowNum) ->  { 
			Weighter w = new Weighter();
			w.setFirstName(rs.getString("firstName"));
			w.setLastName(rs.getString("lastName"));
			w.setUsername(rs.getString("username"));
			w.setSex(rs.getString("sex"));
			w.setWrist(rs.getDouble("wrist"));
			w.setHeight(rs.getDouble("height"));
			w.setSportFactor(rs.getDouble("sportFactor"));
			w.setWeighterId(rs.getLong("weighterId"));
			//Password omitted for security reasons!
			return w;
		}, username);
		return weighter;
	}

	@Override
	public boolean weighterIsUnique(String username) {
		Integer count = new Integer(0);
		count = jdbcOperations.queryForObject(SQL_CHECK_IF_WEIGHTER_EXISTS, Integer.class, username);
		return ((count > 0) ? false:true);
	}

}

