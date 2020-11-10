package Classes;

import java.util.ArrayList;

public class Garage {
	// ATTRIBUTES

	protected String location;
	protected int cost;
	protected ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	// VEHICLES
	public Garage(String location, int cost, Vehicle vehicle) {
		
	Vehicle fiesta = new Car(true, 4, "Ford Fiesta", 1976);
	Vehicle dodge = new Truck(false, 4, "Dodge RAM 2500", "Blue");
	Vehicle Yamaha = new Motorbike(true, 2, "Yamaha", "broken exhaust", true);
	}
	// Car Lamborghini= new Car(false, 4, "Lamborghini Jalpa",1981);//
	// Truck landRover= new Truck(false, 4, "Land Rover Defender","Black");//
	// Motorbike Triumph= new Motorbike(true, 2, "XSR 900","Crushed
	// Engine",false);//
	// Car Merc = new Car(true, 4, "Mercedes A-Class",1997);//

	// METHODS
	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);

	}

	public void remove(int n) {
		this.vehicleList.remove(n);
		
	}
	public void removeAll() {
		this.vehicleList.clear();
		
	}
	public int fixCost(int cost, Vehicle vehicle) {
		for()
		if(vehicle.getWheel() ==2) {
			cost = 200;
		} else {
		cost = 400;
		}
		return cost;
		
		
		
	}
	
	
}
