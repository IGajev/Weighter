package com.zone.data;

import java.util.List;

public interface MeasuresRepository {

	public void saveMeasure(Measure measure);
	public Measure retrieveMeasure();
	public List<Measure> retrieveAllMeasures(Weighter weighter);
}
