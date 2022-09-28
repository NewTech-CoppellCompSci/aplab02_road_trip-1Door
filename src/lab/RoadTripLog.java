package lab;

public class RoadTripLog {

	public String name; //variables
	public double fuel;
	public double distance;
	public double mpg;
	public RoadTripLog(String name) {
		this.name = name; // creates the variables
		this.distance = 0;
		this.fuel = 0;
	}

	public double addDistance(double distan) { //adds distance

		return this.distance += distan;

	}

	public double addFuel(double fue) { //adds fuel

		return this.fuel += fue;

	}
	
	public double getTotalDistance() { //just grabs total distance
		
		return distance;
		
	}
	
	public double getTotalFuel() { //grabs total fuel
		
		return fuel;
		
	}
	
	public double getMPG() { //gets miles per gallon rounded to the 10ths place
		mpg = distance/fuel;
		return Math.round(mpg * 10.0) / 10.0;
	}
	
	@Override
	public String toString() {
		
		return "Trip: " + name + 
			"\n Distance: " + getTotalDistance() + 
			"\nFuel Used: " + getTotalFuel() + 
			"\nMPG: "  + getMPG();
	}
	
	
}