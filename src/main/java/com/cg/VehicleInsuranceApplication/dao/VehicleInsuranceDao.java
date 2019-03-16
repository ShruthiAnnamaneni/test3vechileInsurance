package com.cg.VehicleInsuranceApplication.dao;

import com.cg.VehicleInsuranceApplication.bean.Validity;
import com.cg.VehicleInsuranceApplication.bean.Vehicle;

public interface VehicleInsuranceDao {
	public Vehicle vehicleInsuranceRegistration(Vehicle vehicle);
	public Validity insuranceValidityCheck(Vehicle vehicle);
}
