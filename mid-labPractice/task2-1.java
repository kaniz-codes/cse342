class Smartphone{
    private String brand, model;
    private int capacity;

    public void setter(String brand, String model, int capacity){
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }
    public String getbrand(){
        return this.brand;
    }
    public String getmodel(){
        return this.model;
    }
    public int getcapacity(){
        return this.capacity;
    }

    int increasecapacity(int x){
        this.capacity += x;
        return capacity;
    }
}

public class task{
    public static void main (String args[]){
        Smartphone sm = new Smartphone();
        sm.setter("Toyota", "Toyota Camry", 10);

        System.out.println("Brand: " + sm.getbrand());
        System.out.println("Model: " + sm.getmodel());
        System.out.println("Capacity: " + sm.getcapacity());    
    }
}