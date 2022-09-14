package lab;

public class RoadTripLog {

	public String name;
	public double fuel;
	public double distance;

	public RoadTripLog(String name) {
		this.name = name; // creates the variables
		this.distance = 0;
		this.fuel = 0;
	}

	public double addDistance(double distan) {

		return this.distance += distan;

	}

	public double addFuel(double fue) {

		return this.fuel += fue;

	}
	
	public double getTotalDistance() {
		
		return distance;
		
	}
	
	public double getTotalFuel() {
		
		return fuel;
		
	}
	
	public double getMPG() {
		return distance / fuel;
		
	}
	
	@Override
	public String toString() {
		
		return "Trip: " + name + 
			"\n Distance: " + getTotalDistance() + 
			"\nFuel Used: " + getTotalFuel() + 
			"\nMPG: " + getMPG();
		
	}
	
	
}