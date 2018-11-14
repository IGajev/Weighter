package com.zone.data;

import java.util.List;
import javax.inject.Inject;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import com.zone.entities.Measure;
import com.zone.entities.Weighter;

@Repository
public class JdbcMeasuresRepository implements MeasuresRepository {
	
	private JdbcOperations jdbcOperations;
	private final String SQL_INSERT_MEASURE = "insert into measures (weight, hips, waist, date, weighterId) values (?, ?, ?, ?, ?)";
	
	@Inject
	public JdbcMeasuresRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	@Override
	public void saveMeasure(Measure measure, Weighter weighter) {
		jdbcOperations.update(SQL_INSERT_MEASURE, 
				measure.getWeight(), 
				measure.getHips(), 
				measure.getWaist(), 
				measure.getDate(),
				weighter.getWeighterId());
	}

	@Override
	public List<Measure> retrieveAllMeasuresForWeighter(Weighter weighter) {
		return null;
	}

}
