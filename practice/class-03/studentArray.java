// Constructor Overloading and Array of Objects
class Student{
    int id;
    String name;

    Student(){
        id = 154;
        name = "Kaniz";
    }

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Student id: "+id+ " Name: "+name);
    }
}
public class task5 {
    public static void main(String[] args) {
        Student S[] = {new Student(),
                       new Student(123, "Fatema"),
                       new Student(143, "Ayesha"),
                      };

        for(Student S1 : S){
            S1.display();
        }

    }
}
