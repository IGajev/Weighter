package com.zone.data;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcOperations;

import com.zone.entities.GeneralWeighter;

public class JdbcWeightersRepositoryTest {
	
	private final String SQL_INSERT_WEIGHTER = "insert into weighters (wrist, height, sportFactor, sex, firstName, lastName, username, password) values (?,?,?,?,?,?,?,?)";
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
	public void saveMaleWeighterTest() {
		JdbcOperations jdbcOperations = mock(JdbcOperations.class);
		GeneralWeighter weighterMale = new GeneralWeighter();
		weighterMale.setSex("male");
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		weightersRepository.saveWeighter(weighterMale);
		
		verify(jdbcOperations, times(1)).
		update(SQL_INSERT_WEIGHTER,					
				weighterMale.getWrist(),
				weighterMale.getHeight(),
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
		GeneralWeighter weighterFemale = new GeneralWeighter();
		weighterFemale.setSex("female");
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		weightersRepository.saveWeighter(weighterFemale);
		
		verify(jdbcOperations, times(1)).
		update(SQL_INSERT_WEIGHTER,					
				weighterFemale.getWrist(),
				weighterFemale.getHeight(),
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
		GeneralWeighter weighterGender = new GeneralWeighter();
		weighterGender.setSex("child");
		
		WeightersRepository weightersRepository = new JdbcWeightersRepository(jdbcOperations);
		weightersRepository.saveWeighter(weighterGender);
		
		verify(jdbcOperations, times(1)).
		update(SQL_INSERT_WEIGHTER,					
				weighterGender.getWrist(),
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
