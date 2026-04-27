class Grade <T>{
    T grade;
    Grade(T grade){
        this.grade = grade;
    }

    public T getGrade() {
        return this.grade;
    }

}

public class GradeGenerics {
    public static void main(String[] args) {
        Grade<Integer> intObj = new Grade<>(90);
        Grade<Double> doubleObj = new Grade<>(4.00);
        Grade<String> stringObj = new Grade<>("A+");

        System.out.println("Marks: " + intObj.getGrade());
        System.out.println("CGPA: " + doubleObj.getGrade());
        System.out.println("Grade: " + stringObj.getGrade());
    }
}