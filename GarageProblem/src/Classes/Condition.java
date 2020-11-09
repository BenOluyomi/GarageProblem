package Classes;

public class Condition extends Vehicle{
	//NEW ATTRIBUTE
	String condition;
	boolean canSalvage;
	//CONSTRUCTOR
	public Condition(boolean isAuto, int wheelNum, String make, int releaseYear, String condition, boolean canSalvage){
		//INHERITANCE
		super(isAuto, wheelNum, make);
		this.isAuto = isAuto;
		this.wheelNum = wheelNum;
		this.make = make;
		this.condition = condition;
		this.canSalvage = canSalvage;
	}
	
		
		
		//METHODS
		public String getCondition() {
			return condition;
			
		}
		public boolean getSalvage() {
			return canSalvage;
			
		}
		
		
		public void Method(boolean isAuto, int wheelNum, String make, int releaseYear, String condition, boolean canSalvage) {
			this.isAuto = isAuto;
			this.wheelNum = wheelNum;
			this.make = make;
			this.condition = condition;
			this.canSalvage = canSalvage;
		}
		
	}
	
