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

		String dataPoints = gsonObj.toJson(list);
		return dataPoints;
	}
	
}
