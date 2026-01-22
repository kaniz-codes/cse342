//initialize using constructor

class student{
    private int id;
    private String name;
    private double CGPA;

    student(){
        this.id = 154;
        this.name = "Kaniz";
        this.CGPA =  4.00;
    }
    student(int id,String name,double CGPA){
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }
    student(student s3){
        this.id = s3.id;
        this.name = s3.name;
        this.CGPA = s3.CGPA;
    }

    void show(){
        System.out.println(this.id+" "+this.name+" "+this.CGPA);
    }

}
public class studentInfo1 {
    public static void main (String args[]){
        student s1 = new student();
        student s2 = new student(123, "Fatema", 3.99);
        student s3 = new student(s1);

        s1.show();
        s2.show();
        s3.show();

    }
}
