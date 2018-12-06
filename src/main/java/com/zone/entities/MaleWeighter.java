package com.zone.entities;

import javax.validation.constraints.NotNull;

public class MaleWeighter extends Weighter {
	
	public final int perfectFatsPercent = 15;

	@NotNull
	private String sex;
	
	public MaleWeighter() {}
	
	public String getSex() {
		return sex;
	}

	public void setSex() {
		this.sex = "male";
		
	}

	@Override
	public int getPerfectFatsPercent() {
		return perfectFatsPercent;
	}

}
