package com.cg.VehicleInsuranceApplication.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.VehicleInsuranceApplication.bean.Validity;
import com.cg.VehicleInsuranceApplication.bean.Vehicle;

public class VehicleInsuranceDaoImpl implements VehicleInsuranceDao{
    Validity validity=new Validity();
    Vehicle vehicle=new Vehicle();
	public Vehicle vehicleInsuranceRegistration(Vehicle vehicle) {
		Map<String,Vehicle> insuranceEntry= new HashMap<String,Vehicle>();
		insuranceEntry.put(vehicle.getVehicleNo(),new Vehicle(vehicle.getVehicleType(),vehicle.getInsurancePeriod(),vehicle.getAadharCardNo(),vehicle.getMobileNo()));
		vehicle.setRegistrationDate(java.time.LocalDate.now());  
		return vehicle;
	}

	public Validity insuranceValidityCheck(Vehicle vehicle) {
		validity.setVehicleNo(vehicle.getVehicleNo());
		validity.setRegistrationDate(vehicle.getRegistrationDate());
		validity.setExpireDate(vehicle.getRegistrationDate().plusYears(vehicle.getInsurancePeriod()));
		Map<String,Validity> validityEntry=new HashMap<String,Validity>();
		validityEntry.put(validity.getVehicleNo(),new Validity(validity.getRegistrationDate(),validity.getExpireDate()));
		return validity;
	}

}
