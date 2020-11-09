package Classes;

public class Colour extends Vehicle{
	//NEW ATTRIBUTE
	String colour;
	
	//CONSTRUCTOR
	public Colour(boolean isAuto, int wheelNum, String make, int releaseYear, String condition, String colour){
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
			
		
		public void Method(boolean isAuto, int wheelNum, String make, int releaseYear, String condition, boolean canSalvage) {
			this.isAuto = isAuto;
			this.isAuto = isAuto;
			this.wheelNum = wheelNum;
			this.make = make;
			this.colour = colour;
		}
		
	}
	