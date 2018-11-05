package com.zone.data;

import java.util.Date;

public class Measure {

	public Measure() {}
	
	private long measureId;
	private double weight;
	private double hips;
	private double waist;
	private Date date;
	
	public long getMeasureId() {
		return measureId;
	}
	public void setMeasureId(long measureId) {
		this.measureId = measureId;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHips() {
		return hips;
	}
	public void setHips(double hips) {
		this.hips = hips;
	}
	public double getWaist() {
		return waist;
	}
	public void setWaist(double waist) {
		this.waist = waist;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
