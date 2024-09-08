/*1.Create a base class Vehicle and derived classes Car and Bike. Implement method 
 * overriding and demonstrate polymorphism.*/
package week3;
//Base Class
class Vehicle{
	private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String displayInfo() {
        return "Vehicle: " + make + " " + model;
    }

    public String move() {
        return "The vehicle moves";
    }
}
//Derived class Car
class Car extends Vehicle {
 private int numDoors;

 public Car(String make, String model, int numDoors) {
     super(make, model);
     this.numDoors = numDoors;
 }

 @Override
 public String displayInfo() {
     return "Car: " + super.displayInfo() + ", Doors: " + numDoors;
 }

 @Override
 public String move() {
     return "The car drives on the road";
 }
}

//Derived class Bike
class Bike extends Vehicle {
 private boolean hasGear;

 public Bike(String make, String model, boolean hasGear) {
     super(make, model);
     this.hasGear = hasGear;
 }

 @Override
 public String displayInfo() {
     return "Bike: " + super.displayInfo() + ", Has Gear: " + (hasGear ? "Yes" : "No");
 }

 @Override
 public String move() {
     return "The bike pedals forward";
 }
}

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car("Toyota", "Corolla", 4);
        Vehicle bike = new Bike("Giant", "Escape 3", true);

        showVehicleInfo(car);
        showVehicleInfo(bike);
    }

    public static void showVehicleInfo(Vehicle vehicle) {
        System.out.println(vehicle.displayInfo());
        System.out.println(vehicle.move());
    
	}
}
