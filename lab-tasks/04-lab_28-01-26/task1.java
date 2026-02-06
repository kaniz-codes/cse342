class Vehicle{
    void start(){
        System.out.println("Start vehicle");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Start car.");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Start bike.");
    }
}

public class task1 {
    public static void main (String args[]){
        Vehicle ob1;
        Car ob2 = new Car();
        ob1 = ob2;
        ob1.start();

        Bike ob3 = new Bike();
        ob1 = ob3;
        ob1.start();

    }
}
