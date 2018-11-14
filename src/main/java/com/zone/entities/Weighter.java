package com.zone.entities;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.zone.annotations.UniqueUsername;

public class Weighter {

	public Weighter() {}
	
	private Long weighterId;

	@DecimalMax(value = "100")
	@DecimalMin(value = "1")
	private Double wrist;

	@DecimalMax(value = "300")
	@DecimalMin(value = "1")
	private Double height;
	
	@NotNull
	private Double sportFactor;
	
	@NotNull
	private String sex;
	
	@NotNull
	@Size(min=2, max=30)
	private String firstName;
	
	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	
	@NotNull
	@UniqueUsername
	@Size(min=5, max=16)
	private String username;
	
	@NotNull
	@Size(min=6, max=25)
	private String password;
	
	public Long getWeighterId() {
		return weighterId;
	}

	public void setWeighterId(Long weighterId) {
		this.weighterId = weighterId;
	}

	public Double getWrist() {
		return wrist;
	}

	public void setWrist(Double wrist) {
		this.wrist = wrist;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getSportFactor() {
		return sportFactor;
	}

	public void setSportFactor(Double sportFactor) {
		this.sportFactor = sportFactor;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object that) {
	    return EqualsBuilder.reflectionEquals(this, that);
	}
	  
	@Override
	public int hashCode() {
	    return HashCodeBuilder.reflectionHashCode(this);
	}

}
