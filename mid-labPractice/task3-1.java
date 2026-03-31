class Vehicle{
    void start(){
        System.out.println("Starting Vehicle");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Starting Car");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Starting Bike");
    }
}
public class task{
    public static void main(String[] args){
        Vehicle ob;

        Car car = new Car();
        Bike bike = new Bike();

        ob = car;
        ob.start();
        ob = bike;
        ob.start();
    }

}