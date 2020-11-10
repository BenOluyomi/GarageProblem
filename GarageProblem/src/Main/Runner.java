package Main;
import Classes.Garage;
public class Runner {
	public static void main(String[] arg) {
		Garage g = null;
		g = new Garage(null, 0, null);
		
		//RETRIEVE GENERAL VEHICLE INFORMATION FOR ALL VEHICLES
		g.vehicleNames();
		
		//RETRIEVE THE COST OF REPAIRS FOR ALL VEHICLES *(based on whether its a motorbike,car,automatic etc.)
		g.fixCost();
	}

}
