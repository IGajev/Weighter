package com.zone.data;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcOperations;

import com.zone.entities.Weighter;
import com.zone.exceptions.WeightersException;

public class JdbcWeightersRepositoryTest {
	
	private final String SQL_INSERT_MALE_WEIGHTER = "insert into weighters (wrist, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?)";
	private final String SQL_INSERT_FEMALE_WEIGHTER = "insert into weighters (height, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?)";
	private final String SQL_CHECK_IF_WEIGHTER_EXISTS = "select count(*) from weighters where username = ?";

	@Test
	public void weighterIsUniqueTest() {
		JdbcOperations jdbcOperations = mock(JdbcOperations.class);
		Integer count_zero = new Integer(0);
		when(jdbcOperations.queryForObject(SQL_CHECK_IF_WEIGHTER_EXISTS,Integer.class,"jbauer")).thenReturn(count_zero);
		Integer count_one = new Integer(1);
		when(jdbcOperations.queryForObject(SQL_CHECK_IF_WEIGHTER_EXISTS,Integer.class,"jsmith")).thenReturn(count_one);

		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		
		assertTrue(weightersRepository.weighterIsUnique("jbauer"));
		assertFalse(weightersRepository.weighterIsUnique("jsmith"));
	}

	@Test
	public void saveNullWeighterTest() {
		JdbcOperations jdbcOperations = mock(JdbcOperations.class);
		Weighter weighterNull = new Weighter();
		weighterNull.setSex(null);
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		try {
			weightersRepository.saveWeighter(weighterNull);
		} catch (WeightersException e) {
			assertTrue(true);
		}
		
		verify(jdbcOperations, times(0)).
		update(SQL_INSERT_MALE_WEIGHTER,					
				weighterNull.getWrist(),
				weighterNull.getSportFactor(),
				weighterNull.getSex(),
				weighterNull.getFirstName(),
				weighterNull.getLastName(),
				weighterNull.getUsername(),
				weighterNull.getPassword()
				);

		verify(jdbcOperations, times(0)).
		update(SQL_INSERT_FEMALE_WEIGHTER,					
				weighterNull.getHeight(),
				weighterNull.getSportFactor(),
				weighterNull.getSex(),
				weighterNull.getFirstName(),
				weighterNull.getLastName(),
				weighterNull.getUsername(),
				weighterNull.getPassword()
				);
	}
	
	@Test
	public void saveMaleWeighterTest() {
		JdbcOperations jdbcOperations = mock(JdbcOperations.class);
		Weighter weighterMale = new Weighter();
		weighterMale.setSex("male");
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		try {
			weightersRepository.saveWeighter(weighterMale);
		} catch (WeightersException e) {
			assertTrue(false);
		}
		
		verify(jdbcOperations, times(1)).
		update(SQL_INSERT_MALE_WEIGHTER,					
				weighterMale.getWrist(),
				weighterMale.getSportFactor(),
				weighterMale.getSex(),
				weighterMale.getFirstName(),
				weighterMale.getLastName(),
				weighterMale.getUsername(),
				weighterMale.getPassword()
				);

		verify(jdbcOperations, times(0)).
		update(SQL_INSERT_FEMALE_WEIGHTER,					
				weighterMale.getWrist(),
				weighterMale.getSportFactor(),
				weighterMale.getSex(),
				weighterMale.getFirstName(),
				weighterMale.getLastName(),
				weighterMale.getUsername(),
				weighterMale.getPassword()
				);

	}
	
	@Test
	public void saveFemaleWeighterTest() {
		JdbcOperations jdbcOperations = mock(JdbcOperations.class);
		Weighter weighterFemale = new Weighter();
		weighterFemale.setSex("female");
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		try {
			weightersRepository.saveWeighter(weighterFemale);
		} catch (WeightersException e) {
			assertTrue(false);
		}
		
		verify(jdbcOperations, times(1)).
		update(SQL_INSERT_FEMALE_WEIGHTER,					
				weighterFemale.getHeight(),
				weighterFemale.getSportFactor(),
				weighterFemale.getSex(),
				weighterFemale.getFirstName(),
				weighterFemale.getLastName(),
				weighterFemale.getUsername(),
				weighterFemale.getPassword()
				);

		verify(jdbcOperations, times(0)).
		update(SQL_INSERT_MALE_WEIGHTER,					
				weighterFemale.getWrist(),
				weighterFemale.getSportFactor(),
				weighterFemale.getSex(),
				weighterFemale.getFirstName(),
				weighterFemale.getLastName(),
				weighterFemale.getUsername(),
				weighterFemale.getPassword()
				);

	}
	
	@Test
	public void saveGenderWeighterTest() {
		JdbcOperations jdbcOperations = mock(JdbcOperations.class);
		Weighter weighterGender = new Weighter();
		weighterGender.setSex("gender");
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		try {
			weightersRepository.saveWeighter(weighterGender);
		} catch (WeightersException e) {
			assertTrue(true);
		}
		
		verify(jdbcOperations, times(0)).
		update(SQL_INSERT_MALE_WEIGHTER,					
				weighterGender.getWrist(),
				weighterGender.getSportFactor(),
				weighterGender.getSex(),
				weighterGender.getFirstName(),
				weighterGender.getLastName(),
				weighterGender.getUsername(),
				weighterGender.getPassword()
				);

		verify(jdbcOperations, times(0)).
		update(SQL_INSERT_FEMALE_WEIGHTER,					
				weighterGender.getHeight(),
				weighterGender.getSportFactor(),
				weighterGender.getSex(),
				weighterGender.getFirstName(),
				weighterGender.getLastName(),
				weighterGender.getUsername(),
				weighterGender.getPassword()
				);

	}
}
