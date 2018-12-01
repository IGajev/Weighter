package com.zone.entities;

import javax.validation.constraints.NotNull;

public class FemaleWeighter extends Weighter {
	
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

}
