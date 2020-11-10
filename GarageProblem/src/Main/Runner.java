package Main;
import Classes.Garage;
public class Runner {
	public static void main(String[] arg) {
		Garage g = null;
		g = new Garage(null, 0, null);
		g.vehicleNames();
		g.fixCost(0);
	}

}
