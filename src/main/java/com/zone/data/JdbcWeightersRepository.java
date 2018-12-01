package com.zone.data;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import com.zone.entities.FemaleWeighter;
import com.zone.entities.MaleWeighter;
import com.zone.entities.Weighter;

@Repository
public class JdbcWeightersRepository implements WeightersRepository {

	private JdbcOperations jdbcOperations;
	private final String MALE = "male";
	private final String FEMALE = "female";
	private final String SQL_INSERT_WEIGHTER = "insert into weighters (wrist, height, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?,?)";
	private final String SQL_CHECK_IF_WEIGHTER_EXISTS = "select count(*) from weighters where username = ?";
	private final String SQL_GET_WEIGHTER_BY_USERNAME = "select * from weighters where username = ?";
	private final String SQL_GET_WEIGHTER_SEX = "select sex from weighters where username = ?";
	
	@Inject
	public JdbcWeightersRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	@Override
	public void saveWeighter(Weighter weighter) {
		jdbcOperations.update(SQL_INSERT_WEIGHTER,
				weighter.getWrist(),
				weighter.getHeight(),
				weighter.getSportFactor(),
				weighter.getSex(),
				weighter.getFirstName(),
				weighter.getLastName(),
				weighter.getUsername(),
				weighter.getPassword()
				);	
	}

	@Override
	public Weighter retrieveWeighter(String username) {
		String sex = jdbcOperations.queryForObject(SQL_GET_WEIGHTER_SEX, String.class, username);
		Weighter weighter = null;
		if (sex.equals(MALE)) {
			weighter = jdbcOperations.queryForObject(SQL_GET_WEIGHTER_BY_USERNAME, (rs, rowNum) ->  { 
				MaleWeighter w = new MaleWeighter();
				w.setFirstName(rs.getString("firstName"));
				w.setLastName(rs.getString("lastName"));
				w.setUsername(rs.getString("username"));
				w.setSex();
				w.setWrist(rs.getDouble("wrist"));
				w.setHeight(rs.getDouble("height"));
				w.setSportFactor(rs.getDouble("sportFactor"));
				w.setWeighterId(rs.getLong("weighterId"));
				//Password omitted for security reasons!
				return w;
			}, username);
		} else if (sex.equals(FEMALE)) {
			weighter = jdbcOperations.queryForObject(SQL_GET_WEIGHTER_BY_USERNAME, (rs, rowNum) ->  { 
				FemaleWeighter w = new FemaleWeighter();
				w.setFirstName(rs.getString("firstName"));
				w.setLastName(rs.getString("lastName"));
				w.setUsername(rs.getString("username"));
				w.setSex();
				w.setWrist(rs.getDouble("wrist"));
				w.setHeight(rs.getDouble("height"));
				w.setSportFactor(rs.getDouble("sportFactor"));
				w.setWeighterId(rs.getLong("weighterId"));
				//Password omitted for security reasons!
				return w;
			}, username);
		} else {
			weighter = jdbcOperations.queryForObject(SQL_GET_WEIGHTER_BY_USERNAME, (rs, rowNum) ->  { 
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
		}
		return weighter;
	}

	@Override
	public boolean weighterIsUnique(String username) {
		Integer count = new Integer(0);
		count = jdbcOperations.queryForObject(SQL_CHECK_IF_WEIGHTER_EXISTS, Integer.class, username);
		return ((count > 0) ? false:true);
	}

}

