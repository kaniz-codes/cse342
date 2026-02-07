class Grandfather{
    private String name;
    private int age;

    Grandfather(String name, int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("Grandfather's :" + " name: " + name+ " age: " + age);
    }

}
class Father extends Grandfather{
    private String name1;
    private int age1;

    Father(String name, int age, String name1, int age1){
        super(name,age);
        this.name1 = name1;
        this.age1 = age1;
    }
    void show(){
        super.show();
        System.out.println("Father's :" + " name: " + name1+ " age: " + age1);
    }
}

class Daughter extends Father{
    private String name2;
    private int age2;

    Daughter(String name, int age, String name1, int age1, String name2, int age2){
        super(name, age, name1,age1);
        this.name2 = name2;
        this.age2 = age2;
    }
    void show(){
        super.show();
        System.out.println("Daughter's :" + " name: " + name2+ " age: " + age2);
    }
}
public class GrandfatherClass {
    public static void main(String[] args) {
        Daughter ob1 = new Daughter("Abdul", 70, "Rahat", 45, "Kaniz", 22);
        ob1.show();
    }
}
