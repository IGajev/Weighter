package com.zone.entities;

import javax.validation.constraints.NotNull;

public class FemaleWeighter extends Weighter {
	
	public final int perfectFatsPercent = 22;

	@NotNull
	private String sex;
	
	public FemaleWeighter() {}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = "female";
	}

	public void setSex() {
		this.sex = "female";
	}
	
	@Override
	public int getPerfectFatsPercent() {
		return perfectFatsPercent;
	}

}
