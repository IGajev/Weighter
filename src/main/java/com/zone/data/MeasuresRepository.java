package com.zone.data;

import java.util.List;

public interface MeasuresRepository {

	public void saveMeasure(Measure measure, Weighter weighter);
	public List<Measure> retrieveAllMeasuresForWeighter(Weighter weighter);
}
