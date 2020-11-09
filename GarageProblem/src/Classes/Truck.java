package Classes;

public class Truck extends Vehicle{
	//NEW ATTRIBUTE
	String colour;
	
	//CONSTRUCTOR
	public Truck(boolean isAuto, int wheelNum, String make, String colour){
		//INHERITANCE
		super(isAuto, wheelNum, make);
		this.isAuto = isAuto;
		this.wheelNum = wheelNum;
		this.make = make;
		this.colour = colour;
	}
	
		
		
		//METHODS
		public String getColour() {
			return colour;
			
		}
			
		
		public void Method(boolean isAuto, int wheelNum, String make, String colour) {
			this.isAuto = isAuto;
			this.wheelNum = wheelNum;
			this.make = make;
			this.colour = colour;
		}
		
	}
	