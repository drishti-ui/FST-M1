package activities;

public class Car {

	String color;
    int make;
    String transmission;
    int tyres;
    int doors;
	
    Car() {
	tyres = 4;
	doors = 4;
    }

    //Class Methods
    public void displayCharacterstics(){
	System.out.println("Car color is: " + color);
	System.out.println("Car make is: " + make);
	System.out.println("Transmission is: " + transmission);
	System.out.println("Total number of doors on the car: " + doors);
    	System.out.println("Total number of tyres on the car: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() {
	System.out.println("Car has stopped.");
    }
}
