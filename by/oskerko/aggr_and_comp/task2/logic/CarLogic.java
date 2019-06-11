package oskerko.aggr_and_comp.task2.logic;

import java.util.HashMap;

import oskerko.aggr_and_comp.task2.car.Car;

public class CarLogic {

	public void printBrand(Car car) {
		System.out.println(car.getBrand());
	}
	
	public HashMap<String, String> status(Car car) {
		HashMap<String, String> mapStatus = new HashMap<String, String>();
		
		if(car.isDrive()) {
		mapStatus.put("isDrive", "yes"); 
		} else {
			mapStatus.put("isDrive", "no"); 
		}
		
		if(car.isEmptyTank()) {
			mapStatus.put("isEmptyTank", "yes"); 
		} else {
			mapStatus.put("isEmptyTank", "no"); 
		}
		
		if (car.getEngine().isRun()) {
			mapStatus.put("engineIsRun", "yes");
		} else {
			mapStatus.put("engineIsRun", "no");
		}
			
		if (car.getWheels().get(1).isRotate()) {
			mapStatus.put("wheelsIsRotate", "yes");
		} else {
			mapStatus.put("wheelsIsRotate", "no");
		}
		
		 return mapStatus;
	}
	
}
