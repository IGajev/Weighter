package com.zone.data;

import java.util.List;

import com.zone.entities.Measure;
import com.zone.entities.Weighter;

public interface MeasuresRepository {

	public void saveMeasure(Measure measure, Weighter weighter);
	public List<Measure> retrieveAllMeasuresForWeighter(Weighter weighter);
	public Measure retrieveLastMeasureForWeighter(Weighter weighter);
}
