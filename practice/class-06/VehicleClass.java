class Vehicle {
    void start() {
        System.out.println("Starting Vehicle");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Starting Car");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Starting Bike");
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Vehicle ob1;
        Car ob2 = new Car();
        ob1 = ob2;
        ob1.start();
        Bike ob3 = new Bike();
        ob1 =  ob3;
        ob1.start();
    }
}
