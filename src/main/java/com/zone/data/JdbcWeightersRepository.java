package com.zone.data;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcWeightersRepository implements WeightersRepository {

	private JdbcOperations jdbcOperations;
	
	private final String SQL_INSERT_WEIGHTER = "insert into weighters (wrist, height, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?,?)";

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
	public Weighter retrieveWeighter() {
		// TODO Auto-generated method stub
		return null;
	}

}

