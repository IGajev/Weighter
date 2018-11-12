package com.zone.data;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class Measure {

	public Measure() {}
	
	private Long measureId;
	
	@NotNull
	@DecimalMax(value = "500")
	@DecimalMin(value = "1")
	private Double weight;
	
	private Double hips;
	
	private Double waist;
	
	private Date date;

	public Long getMeasureId() {
		return measureId;
	}

	public void setMeasureId(Long measureId) {
		this.measureId = measureId;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHips() {
		return hips;
	}

	public void setHips(Double hips) {
		this.hips = hips;
	}

	public Double getWaist() {
		return waist;
	}

	public void setWaist(Double waist) {
		this.waist = waist;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
