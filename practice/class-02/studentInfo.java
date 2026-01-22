class student{
    private int id;
    private String name;
    private double CGPA;

    void set (int id, String name, double CGPA){
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    void show(){
        System.out.println("ID: " + id + " Name: " + name + " CGPA: " + CGPA);
    }
}
public class studentInfo {
    public static void main (String args[]){
        student s1 = new student();
        s1.set (154,"Kaniz",4.00);
        s1.show();
    }
}
