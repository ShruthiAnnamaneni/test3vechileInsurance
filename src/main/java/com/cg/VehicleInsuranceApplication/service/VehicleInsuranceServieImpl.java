package com.cg.VehicleInsuranceApplication.service;

import com.cg.VehicleInsuranceApplication.bean.Validity;
import com.cg.VehicleInsuranceApplication.bean.Vehicle;
import com.cg.VehicleInsuranceApplication.dao.VehicleInsuranceDao;
import com.cg.VehicleInsuranceApplication.dao.VehicleInsuranceDaoImpl;

public class VehicleInsuranceServieImpl implements VehicleInsuranceService {
	VehicleInsuranceDao dao=new VehicleInsuranceDaoImpl();

	public Vehicle vehicleInsuranceRegistration(Vehicle vehicle) {
		return dao.vehicleInsuranceRegistration(vehicle);
	}

	public Validity insuranceValidityCheck(Vehicle vehicle) {
		return dao.insuranceValidityCheck(vehicle);
	}

}
