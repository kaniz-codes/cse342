class Smartphone{
    private String brand;
     String model;
     int Capacity;

    public void setter(String brand, String model, int Capacity){
        this.brand = brand;
        this.model = model;
        this.Capacity = Capacity;
    }

    public String getbrand(){
        return brand;
    }
    public String getmodel(){
        return model;
    }
    public int getCapacity(){
        return Capacity;
    }

    int increaseStorage(int x){

        this.Capacity +=  x;
        return Capacity;
    }
}
public class task1 {
    public static void main (String args []){

        Smartphone b1 = new Smartphone();
        b1.setter("Toyota", "Toyota Camry", 10);

        System.out.println("Output: ");

        System.out.println("Brand: "+ b1.getbrand() );

        System.out.println("Model: "+ b1.getmodel());

        System.out.println("Set Capacity: "+ b1.getCapacity());

        System.out.println("Increased Capacity: "+ b1.increaseStorage(5));


    }
}
