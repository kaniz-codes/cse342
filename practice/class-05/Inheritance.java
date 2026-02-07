class A {
    int i, j;
    A(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void show() {
        System.out.println("Sum of i, j: " + (i + j));
    }
}

class B extends A {
    int k;
    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        System.out.println("Sum of i, j & k: " + (i + j + k));
    }
}

class C extends B {
    int l;
    C(int i, int j, int k, int l) {
        super(i, j, k);
        this.l = l;
    }

    void show() {
        System.out.println("Sum of i, j, k & l: " + (i + j + k + l));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B ob1 = new B(1, 2, 3);
        ob1.show();

        A ob2 = new C(1, 2, 3, 4);
        ob2.show();
    }
}
