package Classes;

public class Vehicle {
	// ATTRIBUTES
	protected boolean isAuto;
	protected int wheelNum;
	protected String make;
	
	// CONSTRUCTORS
	public Vehicle(boolean isAuto, int wheelNum, String make) {
		this.isAuto = isAuto;
		this.wheelNum= wheelNum;
		this.make = make;
	}
	
	// METHODS
	public boolean getType() {
		return isAuto;
	}
	
	public int getWheel() {
		return wheelNum;
	}
	
	public String getMake() {
		return make;
	}
	
	
	public void myMethod(boolean isAuto, int wheelNum, String make) {
		
	}
	
}
