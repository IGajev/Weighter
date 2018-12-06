package com.zone.service;

import java.util.List;
import com.zone.entities.Measure;
import com.zone.entities.Weighter;

public interface MeasuresService {
	public String getWeightDataPoints(List<Measure> measures, Weighter loggedWeighter);
	public String getFatsDataPoints(List<Measure> measures, Weighter loggedWeighter);
	public Long getRequiredWeight();
	public Long getDailyProteinRequirementGrams();
	public Long getDailyProteinRequirementBlocks();
	
}
