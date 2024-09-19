package ASSIGNMENT2;

class Vehicle {
    // Method to start the vehicle
    public void start() {
        System.out.println("Vehicle is starting.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a roar.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping smoothly.");
    }
}
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a rev.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping quickly.");
    }
}
public class MainVehicle {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Call start and stop methods on Car
        myCar.start(); // Outputs: Car is starting with a roar.
        myCar.stop();  // Outputs: Car is stopping smoothly.

        // Call start and stop methods on Bike
        myBike.start(); // Outputs: Bike is starting with a rev.
        myBike.stop();  // Outputs: Bike is stopping quickly.
    }
}
