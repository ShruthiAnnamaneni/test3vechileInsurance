package com.cg.VehicleInsuranceApplication;

import java.util.Scanner;

import com.cg.VehicleInsuranceApplication.bean.Validity;
import com.cg.VehicleInsuranceApplication.bean.Vehicle;
import com.cg.VehicleInsuranceApplication.service.VehicleInsuranceService;
import com.cg.VehicleInsuranceApplication.service.VehicleInsuranceServieImpl;

public class App 
{
	 public static void main( String[] args )
	    {
		 VehicleInsuranceService service=new VehicleInsuranceServieImpl();
		 Vehicle vehicle=new Vehicle(); 
		 Validity validity=new Validity();
			Scanner input=new Scanner(System.in);
			while(true) {
				System.out.println("Enter 1) Vehicle Insurance Registration 2) Insurance Validity Check 3) Exit");
				int menu=input.nextInt();
				switch(menu) {
				case 1: 
					System.out.println("Enter vehicle number: ");
					vehicle.setVehicleNo(input.next());
					System.out.println("Enter vehicle type(2 wheeler,4 wheeler etc..): ");
					vehicle.setVehicleType(input.nextInt());
					System.out.println("Enter insurance period(in years)");
					vehicle.setInsurancePeriod(input.nextInt());
					System.out.println("Enter Aadhar number: ");
					vehicle.setAadharCardNo(input.next());
					System.out.println("Enter mobile number: ");
					vehicle.setMobileNo(input.next());
					vehicle=service.vehicleInsuranceRegistration(vehicle);
					System.out.println(vehicle.getRegistrationDate());
					break;
				case 2:
					validity=service.insuranceValidityCheck(vehicle);
					System.out.println("Your insurance expires on: "+validity.getExpireDate());
					System.out.println("Number of days remaining for renewal are: ");
					break;
				case 3:
					System.exit(0);
					break;
					
				}
			}
	
	
   
       
    }
}
