// Array of objects
class Student {
    int id;
    String name;

    Student (int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Id: "+id + " " +"Name: "+name);
    }
}
public class task4 {
    public static void main(String[] args) {

        Student S[] = new Student[3];

        for(int i=0; i<3; i++){
            S[i] = new Student(i+1, i+"");
        }

        for(Student S1 : S){
            S1.display();
        }

        /*for(int i=0; i<3; i++){
            S[i].display();
        }*/
    }
}
