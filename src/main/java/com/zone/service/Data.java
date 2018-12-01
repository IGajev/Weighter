package com.zone.service;

import com.zone.entities.FemaleWeighter;
import com.zone.entities.MaleWeighter;
import com.zone.entities.Measure;
import com.zone.entities.Weighter;

public class Data {
	private Integer value;
	private boolean valid;
	private static final Double toInches = new Double(2.54);
	private static final Double toPounds = new Double(0.453);
	
	public Data(Weighter weighter, Measure measure) {
		this.value = null;
		this.valid = false;
		if (weighter instanceof MaleWeighter) {
			Double difference = ( measure.getWaist() - weighter.getWrist() )/toInches;
			Double weight = measure.getWeight()/toPounds;
			if ( 
					(difference >= MaleFatsTable.DIFFERENCE_MIN) &&
					(difference <= MaleFatsTable.DIFFERENCE_MAX) &&
					(weight     >= MaleFatsTable.WEIGHT_MIN) &&
					(weight     <= MaleFatsTable.WEIGHT_MAX) ) {
				this.value = MaleFatsTable.lookupMaleTable(
						difference, 
						weight);
				this.valid = true;
			}
		} else if (weighter instanceof FemaleWeighter) {
			Double hips = measure.getHips()/toInches;
			Double waist = measure.getWaist()/toInches;
			Double height = weighter.getHeight()/toInches;
			if (
					(hips >= FemaleFatsTable.HIPS_MIN) &&
					(hips <= FemaleFatsTable.HIPS_MAX) &&
					(waist >= FemaleFatsTable.WAIST_MIN) &&
					(waist <= FemaleFatsTable.WAIST_MAX) &&
					(height >= FemaleFatsTable.HEIGHT_MIN) &&
					(height <= FemaleFatsTable.HEIGHT_MAX) ) {
				this.value = FemaleFatsTable.lookupFemaleTable(
						hips, 
						waist, 
						height);
				this.valid = true;
			}
		} else {

		}
	}
	
	public boolean isValid() {
		return this.valid;
	}

	public Integer getValue() {
		return this.value;
	}

}
