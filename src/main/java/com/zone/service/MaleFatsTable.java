package com.zone.service;

import java.util.HashMap;
import java.util.Map;

public class MaleFatsTable {
	
		private static final Map<Long, Integer> weightAxis = new HashMap<>();
		private static final Map<Double, Integer> differenceAxis = new HashMap<>();
		private static final Integer[][] table = new Integer[][] { 
		{ 4, 6, 8, 10, 12, 14, 16, 18, 20, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 50, 52, 54, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ 4, 6, 7, 9, 11, 13, 15, 17, 19, 20, 22, 24, 26, 28, 30, 32, 33, 35, 37, 39, 41, 43, 45, 46, 48, 50, 52, 54, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ 3, 5, 7, 9, 11, 12, 14, 16, 18, 20, 21, 23, 25, 27, 28, 30, 32, 34, 36, 37, 39, 41, 43, 44, 46, 48, 50, 52, 53, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ 3, 5, 7, 8, 10, 12, 13, 15, 17, 19, 20, 22, 24, 26, 27, 29, 31, 32, 34, 36, 38, 39, 41, 43, 44, 46, 48, 50, 51, 53, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ 3, 5, 6, 8, 10, 11, 13, 15, 16, 18, 19, 21, 23, 24, 26, 28, 29, 31, 33, 34, 36, 38, 39, 41, 43, 44, 46, 48, 49, 51, 53, 54, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, 4, 6, 7, 9, 11, 12, 14, 15, 17, 19, 20, 22, 23, 25, 27, 28, 30, 31, 33, 35, 36, 38, 39, 41, 43, 44, 46, 47, 49, 51, 52, 54, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, 4, 6, 7, 9, 10, 12, 13, 15, 16, 18, 19, 21, 23, 24, 26, 27, 29, 30, 32, 33, 35, 36, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, 4, 5, 6, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 29, 31, 32, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, 4, 5, 6, 8, 9, 11, 12, 14, 15, 17, 18, 19, 21, 22, 24, 25, 27, 28, 30, 31, 33, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 48, 50, 51, 53, 54, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, 3, 5, 6, 8, 9, 10, 12, 13, 15, 16, 17, 19, 20, 22, 23, 24, 25, 27, 29, 30, 31, 33, 34, 36, 38, 38, 40, 41, 43, 44, 45, 47, 48, 50, 51, 52, 54, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, 3, 4, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19, 21, 22, 24, 25, 26, 28, 29, 30, 32, 33, 34, 36, 37, 39, 40, 41, 43, 44, 45, 47, 48, 49, 51, 52, 54, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, null, 4, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 19, 20, 21, 23, 24, 25, 27, 28, 29, 31, 32, 33, 35, 36, 37, 39, 40, 41, 43, 44, 45, 47, 48, 49, 51, 52, 53, 55, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, null, 4, 5, 7, 8, 9, 10, 12, 13, 14, 16, 17, 18, 19, 21, 22, 23, 25, 26, 27, 28, 30, 31, 32, 34, 35, 36, 37, 39, 40, 41, 43, 44, 45, 47, 48, 49, 50, 52, 53, 54, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, null, 4, 5, 6, 8, 9, 10, 11, 13, 14, 15, 16, 18, 19, 20, 21, 23, 24, 25, 26, 28, 29, 30, 31, 33, 34, 35, 36, 38, 39, 40, 41, 43, 44, 45, 46, 48, 49, 50, 51, 53, 54, 55, null, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, null, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 22, 23, 24, 26, 27, 28, 29, 30, 32, 33, 34, 35, 37, 38, 39, 40, 41, 43, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, null, null, null, null, null, null, null, null, null, null, null, null },
		{ null, null, 3, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 30, 31, 32, 33, 34, 35, 37, 38, 39, 40, 41, 43, 44, 45, 46, 47, 49, 50, 51, 52, 53, 55, null, null, null, null, null, null, null, null, null, null, null },
		{ null, null, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 28, 29, 30, 31, 32, 33, 35, 36, 37, 38, 39, 40, 41, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, null, null, null, null, null, null, null, null, null },
		{ null, null, null, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 34, 35, 36, 37, 38, 39, 40, 41, 43, 44, 45, 46, 47, 48, 49, 51, 52, 53, 54, 55, null, null, null, null, null, null, null, null },
		{ null, null, null, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 53, 54, 55, null, null, null, null, null, null, null },
		{ null, null, null, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, null, null, null, null, null },
		{ null, null, null, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 28, 29, 30, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, null, null, null, null },
		{ null, null, null, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, null, null, null },
		{ null, null, null, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, null, null },
		{ null, null, null, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 51, 51, 52, 53, 55 },
		{ null, null, null, null, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 46, 47, 48, 49, 50, 51, 52, 53, 54 },
		{ null, null, null, null, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53 },
		{ null, null, null, null, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52 },
		{ null, null, null, null, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 44, 45, 46, 47, 48, 49, 50, 51 },
		{ null, null, null, null, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19, 20, 21, 22, 23, 24, 25, 26, 27, 27, 28, 29, 30, 31, 32, 33, 34, 35, 35, 36, 37, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46, 47, 48, 49, 50 },
		{ null, null, null, null, null, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20, 21, 22, 22, 23, 24, 25, 26, 27, 28, 29, 29, 30, 31, 32, 33, 34, 35, 36, 36, 37, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46, 47, 48, 49 },
		{ null, null, null, null, null, 4, 5, 6, 7, 7, 8, 9, 10, 11, 12, 13, 13, 14, 15, 16, 17, 18, 19, 19, 20, 21, 22, 23, 24, 25, 25, 26, 27, 28, 29, 30, 31, 31, 32, 33, 34, 35, 36, 37, 37, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46, 47, 48 },
		{ null, null, null, null, null, 4, 5, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20, 21, 22, 22, 23, 24, 25, 26, 27, 27, 28, 29, 30, 31, 32, 32, 33, 34, 35, 36, 37, 38, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46, 47 },
		{ null, null, null, null, null, 4, 5, 5, 6, 7, 8, 9, 9, 10, 11, 12, 13, 14, 14, 15, 16, 17, 18, 19, 19, 20, 21, 22, 23, 24, 24, 25, 26, 27, 28, 29, 29, 30, 31, 32, 33, 33, 34, 35, 36, 37, 38, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46 },
		{ null, null, null, null, null, 4, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20, 21, 21, 22, 23, 24, 25, 26, 26, 27, 28, 29, 30, 30, 31, 32, 33, 34, 34, 35, 36, 37, 38, 39, 39, 40, 41, 42, 43, 43, 44, 45 },
		{ null, null, null, null, null, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 19, 20, 21, 22, 23, 23, 24, 25, 26, 27, 27, 28, 29, 30, 31, 31, 32, 33, 34, 35, 35, 36, 37, 38, 39, 39, 40, 41, 42, 43, 43, 44 },
		{ null, null, null, null, null, 3, 4, 5, 6, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 14, 15, 16, 17, 17, 18, 19, 20, 21, 21, 22, 23, 24, 25, 25, 26, 27, 28, 28, 29, 30, 31, 32, 32, 33, 34, 35, 36, 36, 37, 38, 39, 39, 40, 41, 42, 43, 43 },
		{ null, null, null, null, null, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10, 11, 12, 12, 13, 14, 15, 16, 16, 17, 18, 19, 19, 20, 21, 22, 22, 23, 24, 25, 26, 26, 27, 28, 29, 29, 30, 31, 32, 33, 33, 34, 35, 36, 36, 37, 38, 39, 39, 40, 41, 42, 43 }
		};
		
	static {
		weightAxis.put(new Long(120),new Integer(0));
		weightAxis.put(new Long(125),new Integer(1));
		weightAxis.put(new Long(130),new Integer(2));
		weightAxis.put(new Long(135),new Integer(3));
		weightAxis.put(new Long(140),new Integer(4));
		weightAxis.put(new Long(145),new Integer(5));
		weightAxis.put(new Long(150),new Integer(6));
		weightAxis.put(new Long(155),new Integer(7));
		weightAxis.put(new Long(160),new Integer(8));
		weightAxis.put(new Long(165),new Integer(9));
		weightAxis.put(new Long(170),new Integer(10));
		weightAxis.put(new Long(175),new Integer(11));
		weightAxis.put(new Long(180),new Integer(12));
		weightAxis.put(new Long(185),new Integer(13));
		weightAxis.put(new Long(190),new Integer(14));
		weightAxis.put(new Long(195),new Integer(15));
		weightAxis.put(new Long(200),new Integer(16));
		weightAxis.put(new Long(205),new Integer(17));
		weightAxis.put(new Long(210),new Integer(18));
		weightAxis.put(new Long(215),new Integer(19));
		weightAxis.put(new Long(220),new Integer(20));
		weightAxis.put(new Long(225),new Integer(21));
		weightAxis.put(new Long(230),new Integer(22));
		weightAxis.put(new Long(235),new Integer(23));
		weightAxis.put(new Long(240),new Integer(24));
		weightAxis.put(new Long(245),new Integer(25));
		weightAxis.put(new Long(250),new Integer(26));
		weightAxis.put(new Long(255),new Integer(27));
		weightAxis.put(new Long(260),new Integer(28));
		weightAxis.put(new Long(265),new Integer(29));
		weightAxis.put(new Long(270),new Integer(30));
		weightAxis.put(new Long(275),new Integer(31));
		weightAxis.put(new Long(280),new Integer(32));
		weightAxis.put(new Long(285),new Integer(33));
		weightAxis.put(new Long(290),new Integer(34));
		weightAxis.put(new Long(295),new Integer(35));
		weightAxis.put(new Long(300),new Integer(36));
		
		differenceAxis.put(new Double(22.0),new Integer(0));
		differenceAxis.put(new Double(22.5),new Integer(1));
		differenceAxis.put(new Double(23.0),new Integer(2));
		differenceAxis.put(new Double(23.5),new Integer(3));
		differenceAxis.put(new Double(24.0),new Integer(4));
		differenceAxis.put(new Double(24.5),new Integer(5));
		differenceAxis.put(new Double(25.0),new Integer(6));
		differenceAxis.put(new Double(25.5),new Integer(7));
		differenceAxis.put(new Double(26.0),new Integer(8));
		differenceAxis.put(new Double(26.5),new Integer(9));
		differenceAxis.put(new Double(27.0),new Integer(10));
		differenceAxis.put(new Double(27.5),new Integer(11));
		differenceAxis.put(new Double(28.0),new Integer(12));
		differenceAxis.put(new Double(28.5),new Integer(13));
		differenceAxis.put(new Double(29.0),new Integer(14));
		differenceAxis.put(new Double(29.5),new Integer(15));
		differenceAxis.put(new Double(30.0),new Integer(16));
		differenceAxis.put(new Double(30.5),new Integer(17));
		differenceAxis.put(new Double(31.0),new Integer(18));
		differenceAxis.put(new Double(31.5),new Integer(19));
		differenceAxis.put(new Double(32.0),new Integer(20));		
		differenceAxis.put(new Double(32.5),new Integer(21));
		differenceAxis.put(new Double(33.0),new Integer(22));
		differenceAxis.put(new Double(33.5),new Integer(23));
		differenceAxis.put(new Double(34.0),new Integer(24));
		differenceAxis.put(new Double(34.5),new Integer(25));
		differenceAxis.put(new Double(35.0),new Integer(26));
		differenceAxis.put(new Double(35.5),new Integer(27));
		differenceAxis.put(new Double(36.0),new Integer(28));
		differenceAxis.put(new Double(36.5),new Integer(29));
		differenceAxis.put(new Double(37.0),new Integer(30));
		differenceAxis.put(new Double(37.5),new Integer(31));
		differenceAxis.put(new Double(38.0),new Integer(32));
		differenceAxis.put(new Double(38.5),new Integer(33));
		differenceAxis.put(new Double(39.0),new Integer(34));
		differenceAxis.put(new Double(39.5),new Integer(35));
		differenceAxis.put(new Double(40.0),new Integer(36));
		differenceAxis.put(new Double(40.5),new Integer(37));
		differenceAxis.put(new Double(41.0),new Integer(38));
		differenceAxis.put(new Double(41.5),new Integer(39));
		differenceAxis.put(new Double(42.0),new Integer(40));		
		differenceAxis.put(new Double(42.5),new Integer(41));
		differenceAxis.put(new Double(43.0),new Integer(42));
		differenceAxis.put(new Double(43.5),new Integer(43));
		differenceAxis.put(new Double(44.0),new Integer(44));
		differenceAxis.put(new Double(44.5),new Integer(45));
		differenceAxis.put(new Double(45.0),new Integer(46));
		differenceAxis.put(new Double(45.5),new Integer(47));
		differenceAxis.put(new Double(46.0),new Integer(48));
		differenceAxis.put(new Double(46.5),new Integer(49));
		differenceAxis.put(new Double(47.0),new Integer(50));
		differenceAxis.put(new Double(47.5),new Integer(51));
		differenceAxis.put(new Double(48.0),new Integer(52));
		differenceAxis.put(new Double(48.5),new Integer(53));
		differenceAxis.put(new Double(49.0),new Integer(54));
		differenceAxis.put(new Double(49.5),new Integer(55));
		differenceAxis.put(new Double(50.0),new Integer(56));

	}
	
	public static Integer lookupMaleTable(Double difference, Double weight) {
		return table[weightAxis.get( (5*Math.round(weight/5)) )][differenceAxis.get(Math.round(difference*2)/2.0)];
	}

}
