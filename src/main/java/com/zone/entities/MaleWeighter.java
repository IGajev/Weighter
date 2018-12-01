package com.zone.entities;

import javax.validation.constraints.NotNull;

public class MaleWeighter extends Weighter {
	
	@NotNull
	private String sex;
	
	public MaleWeighter() {}
	
	public String getSex() {
		return sex;
	}

	public void setSex() {
		this.sex = "male";
		
	}

}
