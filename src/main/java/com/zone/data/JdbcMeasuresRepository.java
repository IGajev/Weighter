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
	private final String SQL_GET_LAST_MEASURE = "select * from measures where weighterId = ? order by measureId desc limit 1";
	private final String SQL_CHECK_IF_MEASURES_EXISTS = "select count(*) from measures where weighterId = ?";
	private final String SQL_GET_ALL_MEASURES_FOR_WEIGHTER = "select measureId, weight, waist, hips, date from measures where weighterId = ?";

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
		return jdbcOperations.query(
				SQL_GET_ALL_MEASURES_FOR_WEIGHTER, 
				(rs, rsnum) -> {
					Measure m = new Measure();
					m.setMeasureId(rs.getLong("measureId"));
					m.setDate(rs.getDate("date"));
					m.setHips(rs.getDouble("hips"));
					m.setWeight(rs.getDouble("weight"));
					m.setWaist(rs.getDouble("waist"));
					return m;
				},
				weighter.getWeighterId());
	}

	@Override
	public Measure retrieveLastMeasureForWeighter(Weighter weighter) {
		Measure measure = null;
		Integer count = jdbcOperations.queryForObject(SQL_CHECK_IF_MEASURES_EXISTS, Integer.class, weighter.getWeighterId());
		
		if (count > 0) {
			measure = jdbcOperations.queryForObject(SQL_GET_LAST_MEASURE, 
					(rs, rsnum) -> {
						Measure m = new Measure();
						m.setMeasureId(rs.getLong("measureId"));
						m.setDate(rs.getDate("date"));
						m.setHips(rs.getDouble("hips"));
						m.setWeight(rs.getDouble("weight"));
						m.setWaist(rs.getDouble("waist"));
						return m;
					},
					weighter.getWeighterId()
			);
		} 
		return measure;
	}

}
