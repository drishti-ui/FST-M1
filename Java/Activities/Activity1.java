package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = 2014;
        car1.color = "Black";
        car1.transmission = "Manual";
    
        //Using Car class method
        car1.displayCharacterstics();
        car1.accelerate();
        car1.brake();
    }

}