package com.zone.data;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcWeightersRepository implements WeightersRepository {

	private JdbcOperations jdbcOperations;
	
	private final String SQL_INSERT_MALE_WEIGHTER = "insert into weighters (wrist, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?)";
	private final String SQL_INSERT_FEMALE_WEIGHTER = "insert into weighters (height, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?)";
	private final String SQL_CHECK_IF_WEIGHTER_EXISTS = "select count(*) from weighters where username = ?";
	
	@Inject
	public JdbcWeightersRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	@Override
	public void saveWeighter(Weighter weighter) throws WeightersException {
		if (weighter.getSex().equals("male")) {
			jdbcOperations.update(SQL_INSERT_MALE_WEIGHTER,
					weighter.getWrist(),
					weighter.getSportFactor(),
					weighter.getSex(),
					weighter.getFirstName(),
					weighter.getLastName(),
					weighter.getUsername(),
					weighter.getPassword()
					);
		} else if (weighter.getSex().equals("female")) {
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
	public Weighter retrieveWeighter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean weighterIsUnique(String username) {
		Integer count = new Integer(0);
		count = jdbcOperations.queryForObject(SQL_CHECK_IF_WEIGHTER_EXISTS, Integer.class, username);
		return ((count > 0) ? false:true);
	}

}

