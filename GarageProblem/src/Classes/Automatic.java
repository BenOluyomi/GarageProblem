package Classes;

public class Automatic extends Vehicle{
	//NEW ATTRIBUTE
	int releaseYear;
	public Automatic(boolean isAuto, int wheelNum, String make, int releaseYear){
		//INHERITANCE
		super(isAuto, wheelNum, make);
		this.isAuto = isAuto;
		this.wheelNum = wheelNum;
		this.make = make;
		this.releaseYear= releaseYear;
	}
	
		//CONSTRUCTOR
		
		//METHODS
		public int getYear() {
			return releaseYear;
		}
		public void Method(boolean isAuto, int wheelNum, String make, int releaseYear) {
			this.isAuto = isAuto;
			this.wheelNum = wheelNum;
			this.make = make;
			this.releaseYear = releaseYear;
		}
		
	}
	