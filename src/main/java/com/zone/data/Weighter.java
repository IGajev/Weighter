package com.zone.data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Weighter {

	public Weighter() {}
	
	private long weighterId;

	@DecimalMax(value = "100")
	@DecimalMin(value = "1")
	private double wrist;

	@DecimalMax(value = "300")
	@DecimalMin(value = "1")
	private double height;
	
	@NotNull
	private double sportFactor;
	
	@NotNull
	private String sex;
	
	@NotNull
	@Size(min=2, max=30)
	private String firstName;
	
	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	
	@NotNull
	@Size(min=5, max=16)
	private String username;
	
	@NotNull
	@Size(min=6, max=25)
	private String password;
	
	public long getWeighterId() {
		return weighterId;
	}
	public void setWeighterId(long weighterId) {
		this.weighterId = weighterId;
	}
	public double getWrist() {
		return wrist;
	}
	public void setWrist(double wrist) {
		this.wrist = wrist;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getSportFactor() {
		return sportFactor;
	}
	public void setSportFactor(double sportFactor) {
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
