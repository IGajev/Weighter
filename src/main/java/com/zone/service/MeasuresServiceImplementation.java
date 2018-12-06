package com.zone.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zone.entities.Measure;
import com.zone.entities.Weighter;

@Service
public class MeasuresServiceImplementation implements MeasuresService {

	private Long requiredWeight;
	private Long dailyProteinRequirementGrams;
	private Long dailyProteinRequirementBlocks;
	
	public String getWeightDataPoints(List<Measure> measures, Weighter loggedWeighter) {
		Gson gsonObj = new Gson();
		Map<Object,Object> map = null;
		List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
		for (Measure measure : measures) {
			map = new HashMap<Object,Object>();	
			map.put("x", measure.getDate().getTime()); 
			map.put("y", measure.getWeight()); 
			list.add(map);
		}

		String dataPoints = gsonObj.toJson(list);
		return dataPoints;
	}

	public String getFatsDataPoints(List<Measure> measures, Weighter loggedWeighter) {
		this.requiredWeight = null;
		this.dailyProteinRequirementGrams = null;
		this.dailyProteinRequirementBlocks = null;
		Gson gsonObj = new Gson();
		Map<Object,Object> map = null;
		List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
		for (Measure measure : measures) {
			Data data = new Data(loggedWeighter, measure);
			if (data.isValid()) {
				map = new HashMap<Object,Object>();	
				map.put("x", measure.getDate().getTime()); 
				map.put("y", data.getValue()); 
				list.add(map);
			}
		}
		if ( list.size() > 0 ) {
			int lastValidIndexValue = list.size() - 1;
			Integer lastValidFatsPercent = (Integer) list.get(lastValidIndexValue).get("y");
			if ( lastValidFatsPercent != null) {
				long lastValidMeasureIndex = (long) list.get(lastValidIndexValue).get("x");
				for (Measure measure : measures) {
					if (measure.getDate().getTime() == lastValidMeasureIndex) {
						Double lastValidWeight = measure.getWeight();
						Double leanBodyMass = (lastValidWeight - lastValidWeight*(lastValidFatsPercent/100.0));
						this.requiredWeight = Math.round(leanBodyMass + leanBodyMass * (loggedWeighter.getPerfectFatsPercent()/100.0));
						this.dailyProteinRequirementGrams = Math.round(leanBodyMass/0.453*loggedWeighter.getSportFactor());
						this.dailyProteinRequirementBlocks = Math.round(leanBodyMass/0.453*loggedWeighter.getSportFactor()/7.0);
					}
				}	
			}
		}

		String dataPoints = gsonObj.toJson(list);
		return dataPoints;
	}

	public Long getRequiredWeight() {
		return requiredWeight;
	}

	public Long getDailyProteinRequirementGrams() {
		return dailyProteinRequirementGrams;
	}

	public Long getDailyProteinRequirementBlocks() {
		return dailyProteinRequirementBlocks;
	}
	
}
