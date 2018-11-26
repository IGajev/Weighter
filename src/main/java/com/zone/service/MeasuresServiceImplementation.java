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

	@Override
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

	@Override
	public String getFatsDataPoints(List<Measure> measures, Weighter loggedWeighter) {
		Gson gsonObj = new Gson();
		Map<Object,Object> map = null;
		List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
		for (Measure measure : measures) {
			map = new HashMap<Object,Object>();	
			map.put("x", measure.getDate().getTime()); 
			map.put("y", getFatsPercent(loggedWeighter, measure)); 
			list.add(map);
		}

		String dataPoints = gsonObj.toJson(list);
		return dataPoints;
	}
	
	private Integer getFatsPercent(Weighter weighter, Measure measure) {
		Integer dataPointFats = null;
		if (weighter.getSex().equals("male")) {
			if (!measure.getWaist().equals(0.0)) {
				Double difference = ( measure.getWaist() - weighter.getWrist() )/2.54;
				Double weight = measure.getWeight()/0.453;
				dataPointFats = MaleFatsTable.lookupMaleTable(difference, weight);
			}
		} else if (weighter.getSex().equals("female")) {
			
		} else {
			
		}
		return dataPointFats;
	}

	
}
