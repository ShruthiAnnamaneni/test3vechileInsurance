package com.cg.VehicleInsuranceApplication.bean;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle {
	private String vehicleNo;
	private int vehicleType,insurancePeriod;
	private String aadharCardNo,mobileNo;
	private LocalDate registrationDate,expireDate;
	
	public Vehicle(int vehicleType,int insurancePeriod,String aadharCardNo,String mobileNo) {
		this.vehicleType=vehicleType;
		this.insurancePeriod=insurancePeriod;
		this.aadharCardNo=aadharCardNo;
		this.mobileNo=mobileNo;
	}
	
	public Vehicle() {
	}

	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
