class A {
    <T> void search(T[] a, T b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b)) {
                System.out.println("Index no: " + i);
            }
        }
    }
}

public class ArrayGenerics {
    public static void main(String[] args) {
        A obj = new A();

        Integer a[] = {1, 2, 3, 4, 5};
        String b[] = {"A", "B", "C"};

        obj.search(a, 5);
        obj.search(b, "B");
    }
}