class exp1 extends Exception {
    exp1(String s) {
        super(s);
    }
}

class abc {
    int age;

    abc(int age) {
        this.age = age;
    }

    void check() throws exp1 {
        if (age < 18)
            throw new exp1("Not eligible");
        else
            System.out.println("Eligible");
    }
}

public class checkage {
    public static void main(String[] args) {
        abc ob1 = new abc(12);

        try {
            ob1.check();
        } catch (exp1 e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}