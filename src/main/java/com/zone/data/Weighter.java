package com.zone.data;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Weighter {

	public Weighter() {}
	
	private long weighterId;
	private double wrist;
	private double height;
	private double sportFactor;
	private String sex;
	private String firstName;
	private String lastName;
	private String username;
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
