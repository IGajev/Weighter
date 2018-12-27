package com.zone.service;

import java.util.List;

import com.zone.entities.GeneralWeighter;
import com.zone.entities.Measure;

public interface MeasuresService {
	public String getWeightDataPoints(List<Measure> measures, GeneralWeighter loggedWeighter);
	public String getFatsDataPoints(List<Measure> measures, GeneralWeighter loggedWeighter);
	public Long getRequiredWeight();
	public Long getDailyProteinRequirementGrams();
	public Long getDailyProteinRequirementBlocks();
	
}
