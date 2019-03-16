package com.cg.VehicleInsuranceApplication.bean;

import java.time.LocalDate;

public class Validity {
	private String vehicleNo;
	private LocalDate registrationDate;
	private LocalDate expireDate;
	
	public Validity(LocalDate registrationDate,LocalDate expireDate) {
		this.registrationDate=registrationDate;
		this.expireDate=expireDate;
	}
	public Validity() {
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	
	

}
