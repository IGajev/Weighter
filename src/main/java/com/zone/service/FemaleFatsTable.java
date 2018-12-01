package com.zone.service;

import java.util.HashMap;
import java.util.Map;

public class FemaleFatsTable {
	
	private static final Map<Double, Double> hips = new HashMap<>();
	private static final Map<Double, Double> waist = new HashMap<>();
	private static final Map<Double, Double> height = new HashMap<>();
	
	static {
		
		/* Hips table */
		hips.put(new Double(30.00),new Double(33.48));
		hips.put(new Double(30.50),new Double(33.83));
		hips.put(new Double(31.00),new Double(34.87));
		hips.put(new Double(31.50),new Double(35.22));
		hips.put(new Double(32.00),new Double(36.27));
		hips.put(new Double(32.50),new Double(36.62));
		hips.put(new Double(33.00),new Double(37.67));
		hips.put(new Double(33.50),new Double(38.02));
		hips.put(new Double(34.00),new Double(39.06));
		hips.put(new Double(34.50),new Double(39.41));
		hips.put(new Double(35.00),new Double(40.46));
		hips.put(new Double(35.50),new Double(40.81));
		hips.put(new Double(36.00),new Double(41.86));
		hips.put(new Double(36.50),new Double(42.21));
		hips.put(new Double(37.00),new Double(43.25));
		hips.put(new Double(37.50),new Double(43.60));
		hips.put(new Double(38.00),new Double(44.65));
		hips.put(new Double(38.50),new Double(45.32));
		hips.put(new Double(39.00),new Double(46.05));
		hips.put(new Double(39.50),new Double(46.40));
		hips.put(new Double(40.00),new Double(47.44));
		hips.put(new Double(40.50),new Double(47.79));
		hips.put(new Double(41.00),new Double(48.84));
		hips.put(new Double(41.50),new Double(49.19));
		hips.put(new Double(42.00),new Double(50.24));
		hips.put(new Double(42.50),new Double(50.59));
		hips.put(new Double(43.00),new Double(51.64));
		hips.put(new Double(43.50),new Double(51.99));
		hips.put(new Double(44.00),new Double(53.03));
		hips.put(new Double(44.50),new Double(53.41));
		hips.put(new Double(45.00),new Double(54.53));
		hips.put(new Double(45.50),new Double(54.86));
		hips.put(new Double(46.00),new Double(55.83));
		hips.put(new Double(46.50),new Double(56.18));
		hips.put(new Double(47.00),new Double(57.22));
		hips.put(new Double(47.50),new Double(57.57));
		hips.put(new Double(48.00),new Double(58.62));
		hips.put(new Double(48.50),new Double(58.97));
		hips.put(new Double(49.00),new Double(60.02));
		hips.put(new Double(49.50),new Double(60.37));
		hips.put(new Double(50.00),new Double(61.42));
		hips.put(new Double(50.50),new Double(61.77));
		hips.put(new Double(51.00),new Double(62.81));
		hips.put(new Double(51.50),new Double(63.16));
		hips.put(new Double(52.00),new Double(64.21));
		hips.put(new Double(52.50),new Double(64.56));
		hips.put(new Double(53.00),new Double(65.61));
		hips.put(new Double(53.50),new Double(65.96));
		hips.put(new Double(54.00),new Double(67.00));
		hips.put(new Double(54.50),new Double(67.35));
		hips.put(new Double(55.00),new Double(68.40));
		hips.put(new Double(55.50),new Double(68.75));
		hips.put(new Double(56.00),new Double(69.80));
		hips.put(new Double(56.50),new Double(70.15));
		hips.put(new Double(57.00),new Double(71.19));
		hips.put(new Double(57.50),new Double(71.54));
		hips.put(new Double(58.00),new Double(72.59));
		hips.put(new Double(58.50),new Double(72.94));
		hips.put(new Double(59.00),new Double(73.99));
		hips.put(new Double(59.50),new Double(74.34));
		hips.put(new Double(60.00),new Double(75.39));
		
		/* Waist table */
		waist.put(new Double(20.00),new Double(14.22));
		waist.put(new Double(20.50),new Double(14.40));
		waist.put(new Double(21.00),new Double(14.93));
		waist.put(new Double(21.50),new Double(15.11));
		waist.put(new Double(22.00),new Double(15.64));
		waist.put(new Double(22.50),new Double(15.82));
		waist.put(new Double(23.00),new Double(16.35));
		waist.put(new Double(23.50),new Double(16.53));
		waist.put(new Double(24.00),new Double(17.06));
		waist.put(new Double(24.50),new Double(17.24));
		waist.put(new Double(25.00),new Double(17.78));
		waist.put(new Double(25.50),new Double(17.96));
		waist.put(new Double(26.00),new Double(18.49));
		waist.put(new Double(26.50),new Double(18.67));
		waist.put(new Double(27.00),new Double(19.20));
		waist.put(new Double(27.50),new Double(19.38));
		waist.put(new Double(28.00),new Double(19.91));
		waist.put(new Double(28.50),new Double(20.27));
		waist.put(new Double(29.00),new Double(20.62));
		waist.put(new Double(29.50),new Double(20.80));
		waist.put(new Double(30.00),new Double(21.33));
		waist.put(new Double(30.50),new Double(21.51));
		waist.put(new Double(31.00),new Double(22.04));
		waist.put(new Double(31.50),new Double(22.22));
		waist.put(new Double(32.00),new Double(22.75));
		waist.put(new Double(32.50),new Double(22.93));
		waist.put(new Double(33.00),new Double(23.46));
		waist.put(new Double(33.50),new Double(23.64));
		waist.put(new Double(34.00),new Double(24.18));
		waist.put(new Double(34.50),new Double(24.36));
		waist.put(new Double(35.00),new Double(24.89));
		waist.put(new Double(35.50),new Double(25.07));
		waist.put(new Double(36.00),new Double(25.60));
		waist.put(new Double(36.50),new Double(25.78));
		waist.put(new Double(37.00),new Double(26.31));
		waist.put(new Double(37.50),new Double(26.49));
		waist.put(new Double(38.00),new Double(27.02));
		waist.put(new Double(38.50),new Double(27.20));
		waist.put(new Double(39.00),new Double(27.73));
		waist.put(new Double(39.50),new Double(27.91));
		waist.put(new Double(40.00),new Double(28.44));
		waist.put(new Double(40.50),new Double(28.62));
		waist.put(new Double(41.00),new Double(29.15));
		waist.put(new Double(41.50),new Double(29.33));
		waist.put(new Double(42.00),new Double(29.87));
		waist.put(new Double(42.50),new Double(30.05));
		waist.put(new Double(43.00),new Double(30.58));
		waist.put(new Double(43.50),new Double(30.76));
		waist.put(new Double(44.00),new Double(31.29));
		waist.put(new Double(44.50),new Double(31.47));
		waist.put(new Double(45.00),new Double(32.00));
		waist.put(new Double(45.50),new Double(32.18));
		waist.put(new Double(46.00),new Double(32.71));
		waist.put(new Double(46.50),new Double(32.89));
		waist.put(new Double(47.00),new Double(33.42));
		waist.put(new Double(47.50),new Double(33.60));
		waist.put(new Double(48.00),new Double(34.13));
		waist.put(new Double(48.50),new Double(34.31));
		waist.put(new Double(49.00),new Double(34.84));
		waist.put(new Double(49.50),new Double(35.02));
		waist.put(new Double(50.00),new Double(35.56));
	
		/* Height table */
		height.put(new Double(55.00),new Double(33.52));
		height.put(new Double(55.50),new Double(33.67));
		height.put(new Double(56.00),new Double(34.13));
		height.put(new Double(56.50),new Double(34.28));
		height.put(new Double(57.00),new Double(34.74));
		height.put(new Double(57.50),new Double(34.89));
		height.put(new Double(58.00),new Double(35.35));
		height.put(new Double(58.50),new Double(35.50));
		height.put(new Double(59.00),new Double(35.96));
		height.put(new Double(59.50),new Double(36.11));
		height.put(new Double(60.00),new Double(36.57));
		height.put(new Double(60.50),new Double(36.72));
		height.put(new Double(61.00),new Double(37.18));
		height.put(new Double(61.50),new Double(37.33));
		height.put(new Double(62.00),new Double(37.79));
		height.put(new Double(62.50),new Double(37.94));
		height.put(new Double(63.00),new Double(38.40));
		height.put(new Double(63.50),new Double(38.70));
		height.put(new Double(64.00),new Double(39.01));
		height.put(new Double(64.50),new Double(39.16));
		height.put(new Double(65.00),new Double(39.62));
		height.put(new Double(65.50),new Double(39.77));
		height.put(new Double(66.00),new Double(40.23));
		height.put(new Double(66.50),new Double(40.38));
		height.put(new Double(67.00),new Double(40.84));
		height.put(new Double(67.50),new Double(40.99));
		height.put(new Double(68.00),new Double(41.45));
		height.put(new Double(68.50),new Double(41.60));
		height.put(new Double(69.00),new Double(42.06));
		height.put(new Double(69.50),new Double(42.21));
		height.put(new Double(70.00),new Double(42.67));
		height.put(new Double(70.50),new Double(42.82));
		height.put(new Double(71.00),new Double(43.28));
		height.put(new Double(71.50),new Double(43.43));
		height.put(new Double(72.00),new Double(43.89));
		height.put(new Double(72.50),new Double(44.04));
		height.put(new Double(73.00),new Double(44.50));
		height.put(new Double(73.50),new Double(44.65));
		height.put(new Double(74.00),new Double(45.11));
		height.put(new Double(74.50),new Double(45.26));
		height.put(new Double(75.00),new Double(45.72));
		height.put(new Double(75.50),new Double(45.87));
		height.put(new Double(76.00),new Double(46.32));
	
	}
		
	public static final double HIPS_MIN = 30.0;
	public static final double HIPS_MAX = 60.0;
	public static final double WAIST_MIN = 20.0;
	public static final double WAIST_MAX = 50.0;
	public static final double HEIGHT_MIN = 55.0;
	public static final double HEIGHT_MAX = 76.0;
	
	
	public static Integer lookupFemaleTable(Double hipsKey, Double waistKey, Double heightKey) {
		Double A = hips.get( Math.round(hipsKey*2)/2.0 );
		Double B = waist.get( Math.round(waistKey*2)/2.0 );
		Double C = height.get( Math.round(heightKey*2)/2.0 );
		
		return new Integer((int)Math.round(A+B-C));
	}

}
