//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.


class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    double fuelEfficiency;
    double distanceTravelled;
    double maxSpeed;

    Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency, double distanceTravelled, double maxSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.distanceTravelled = distanceTravelled;
        this.maxSpeed = maxSpeed;
    }

    public double calculateFuelEfficiency() {
        return distanceTravelled / fuelEfficiency;
    }

    public double calculateDistanceTravelled() {
        return fuelEfficiency * distanceTravelled;
    }

    public double calculateMaxSpeed() {
        return maxSpeed;
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double distanceTravelled, double maxSpeed) {
        super(make, model, year, fuelType, fuelEfficiency, distanceTravelled, maxSpeed);
    }
}

class Car extends
Vehicle {
    Car(String make, String model, int year, String fuelType, double fuelEfficiency, double distanceTravelled, double maxSpeed) {
        super(make, model, year, fuelType, fuelEfficiency, distanceTravelled, maxSpeed);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double distanceTravelled, double maxSpeed) {
        super(make, model, year, fuelType, fuelEfficiency, distanceTravelled, maxSpeed);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Truck truck = new Truck("Tata", "LPT", 2020, "Diesel", 10, 100, 80);
        Car car = new Car("Maruti", "Swift", 2021, "Petrol", 15, 200, 120);
        Motorcycle motorcycle = new Motorcycle("Royal Enfield", "Classic 350", 2019, "Petrol", 20, 150, 100);

        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Truck Distance Travelled: " + truck.calculateDistanceTravelled());
        System.out.println("Truck Max Speed: " + truck.calculateMaxSpeed());

        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Car Distance Travelled: " + car.calculateDistanceTravelled());
        System.out.println("Car Max Speed: " + car.calculateMaxSpeed());

        System.out.println("Motorcycle Fuel Efficiency: " + motorcycle.calculateFuelEfficiency());
        System.out.println("Motorcycle Distance Travelled: " + motorcycle.calculateDistanceTravelled());
        System.out.println("Motorcycle Max Speed: " + motorcycle.calculateMaxSpeed());
    }
}

