package com.zone.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.zone.annotations.UniqueUsername;

public class GeneralWeighter extends Weighter {

	@NotNull
	@UniqueUsername
	@Size(min=5, max=16)
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
