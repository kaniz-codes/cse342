class GenericTest<T> {
    T obj;

    GenericTest(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

public class basicGenerics {
    public static void main(String[] args) {
        GenericTest<Integer>intobj =  new GenericTest <> (100);
        System.out.println("Integer Object: " + intobj.getObject());

        GenericTest<String>strObj  = new GenericTest<>("All the best for Exam!✨");
        System.out.println("String Object: " + strObj.getObject());
    }
}