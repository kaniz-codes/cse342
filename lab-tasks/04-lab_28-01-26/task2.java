class Animal{
    void makeSound(){
        System.out.println("Woowoow");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Vaw vaw.");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meaw meaw.");
    }
}

public class task2 {
    public static void main (String args[]){
        Animal ob1;
        Dog ob2 = new Dog();
        ob1 = ob2;
        ob1.makeSound();

        Cat ob3 = new Cat();
        ob1 = ob3;
        ob1.makeSound();

    }
}
