package com.cg.VehicleInsuranceApplication.service;

import com.cg.VehicleInsuranceApplication.bean.Validity;
import com.cg.VehicleInsuranceApplication.bean.Vehicle;

public interface VehicleInsuranceService {

	public Vehicle vehicleInsuranceRegistration(Vehicle vehicle);
	public Validity insuranceValidityCheck(Vehicle vehicle); 
	
}
