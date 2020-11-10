package Classes;

import java.util.ArrayList;

public class Garage {
	// ATTRIBUTES

	//protected String location;
	protected int cost;
	protected ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	// VEHICLES
	public Garage(String location, int cost, Vehicle vehicle) {
	//this.location = location;
	this.cost = cost;	
	
	Vehicle fiesta = new Car(true, 4, "Ford Fiesta Car", 1976);
	Vehicle dodge = new Truck(false, 4, "Dodge RAM 2500 Truck", "Blue");
	Vehicle yamaha = new Motorbike(true, 2, "Yamaha Bike", "broken exhaust", true);
	Car lamborghini= new Car(false, 4, "Lamborghini Jalpa Car",1981);//
	Truck landRover= new Truck(false, 4, "Land Rover Defender Truck","Black");//
	Motorbike triumph= new Motorbike(true, 2, "XSR 900 Bike","Crushed Engine",false);//
	Car merc = new Car(true, 4, "Mercedes A-Class Car",1997);//
	
	vehicleList.add(fiesta);
	vehicleList.add(dodge);
	vehicleList.add(yamaha);
	vehicleList.add(lamborghini);
	vehicleList.add(landRover);
	vehicleList.add(triumph);
	vehicleList.add(merc);
	
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
		
			System.out.println("Vehicle is a"+handle.toString()+" Subclass "+handle.getMake()+" with "+handle.getWheel()+" wheels.");
		
	}
	}
	
	
	//CALUCLATE THE COST FOR EACH VEHICLE IN THE LIST
	public void fixCost(int cost) {
		for(Vehicle handle: vehicleList)	{
		if(handle.getWheel() ==2) {
			cost = 200;
		} else if (handle.getWheel() ==4 && handle.isAuto){
		cost = 400;
		} else {
			cost = 300;
		}
		System.out.println(handle.getMake()+ " will cost £"+cost+" to repair.");
		}
		
		
		
		
		
	}
	
	
}
