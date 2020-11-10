package Classes;

import java.util.ArrayList;

public class Garage {
	// ATTRIBUTES

	protected String location;
	protected int cost;
	protected ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	// VEHICLES
	public Garage(String location, int cost, Vehicle vehicle) {
	this.location = location;
	this.cost = cost;	
	
	Vehicle fiesta = new Car(true, 4, "Ford Fiesta Car", 1976);
	Vehicle dodge = new Truck(false, 4, "Dodge RAM 2500 Truck", "Blue");
	Vehicle Yamaha = new Motorbike(true, 2, "Yamaha Bike", "broken exhaust", true);
	// Car Lamborghini= new Car(false, 4, "Lamborghini Jalpa",1981);//
	// Truck landRover= new Truck(false, 4, "Land Rover Defender","Black");//
	// Motorbike Triumph= new Motorbike(true, 2, "XSR 900","Crushed
	// Engine",false);//
	// Car Merc = new Car(true, 4, "Mercedes A-Class",1997);//
	
	vehicleList.add(fiesta);
	vehicleList.add(dodge);
	vehicleList.add(Yamaha);
	
	}
	

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
	
	public void vehicleNames() {
	for(Vehicle handle: vehicleList)	{
		
			System.out.println(handle.getMake());
		
	}
	}
	
	public int fixCost(int cost) {
		for(Vehicle handle: vehicleList)	{
		if(handle.getWheel() ==2) {
			cost = 200;
		} else if (handle.getWheel() ==4 && handle.isAuto){
		cost = 400;
		} else {
			cost = 300;
		}
		System.out.println(cost);
		}
		
		return cost;
		
		
		
	}
	
	
}
