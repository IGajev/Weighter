package com.zone.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.zone.annotations.ValidPassword;

public class UpdatedWeighter extends Weighter {
	
	public UpdatedWeighter() {}
	
	@NotNull
	@Size(min=6, max=25)
	@ValidPassword
	private String oldPassword;

	@NotNull
	@Size(min=5, max=16)
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
}
