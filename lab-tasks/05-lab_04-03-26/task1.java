class Student{
    String name;
    int completedCredit;

    Student(){
        name= null;
        completedCredit = 0;
    }

    Student(String name, int completedCredit){
        this.name = name;
        this.completedCredit = completedCredit;
    }

    void checkName(){
        try{
            System.out.println("Name: "+ name + " Length: " + name.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Student profile not found. Skipping this student. "+ e);
        }
    }

    void calculate(){
        try{
            System.out.println("GPA: "+ (int)(18/completedCredit));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error "+ e);
        }
    }
}
public class task1 {
    public static void main(String args[]){
        Student ob = new Student("Kaniz", 6);
        Student ob1 = new Student("Fatema", 0);
        Student ob2 = new Student();

        System.out.println("Processing student 1:");
        ob.checkName();
        ob.calculate();

        System.out.println("Processing student 2:");
        ob1.checkName();
        ob1.calculate();

        System.out.println("Processing student 3:");
        ob2.checkName();
        ob2.calculate();

    }
}
