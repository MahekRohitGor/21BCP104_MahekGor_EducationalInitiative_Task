package demonstration;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a Car!");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a Bike!");
    }
}

class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive(); // Output: Driving a Car!

        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.drive(); // Output: Riding a Bike!
    }
}

