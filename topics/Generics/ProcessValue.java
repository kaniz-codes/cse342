interface Processor<T> {
    void process(T value);
}

class StringProcessor implements Processor<String> {
    public void process(String value) {
        System.out.println("Processed String: " + value);
    }
}

class IntegerProcessor implements Processor<Integer> {
    public void process(Integer value) {
        System.out.println("Processed Integer: " + value);
    }
}

public class ProcessValue{
    public static void main(String[] args) {
        Processor<String> p1 = new StringProcessor();
        p1.process("All the best for exam!");

        Processor<Integer> p2 = new IntegerProcessor();
        p2.process(100);
    }
}