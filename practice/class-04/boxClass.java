class Box {
    protected int h, w, d;

    Box() {
        h = 5;
        w = 8;
        d = 3;
    }

    Box(int h, int w, int d) {
        this.h = h;
        this.w = w;
        this.d = d;
    }

    Box(Box ob) {
        this.h = ob.h;
        this.w = ob.w;
        this.d = ob.d;
    }

    void volume() {
        System.out.println("Volume: " + (h * w * d));
    }
}

class Box1 extends Box {
    private int weight;

    Box1() {
        super();
        weight = 1;
    }

    Box1(int h, int w, int d, int weight) {
        super(h, w, d);
        this.weight = weight;
    }

    Box1(Box1 ob) {
        super(ob);
        this.weight = ob.weight;
    }

    void volume() {
        System.out.println("Volume: " + (h*w*d) + "  Weight: " + weight);
    }
}

public class boxClass {
    public static void main(String args[]) {
        Box1 ob = new Box1();
        ob.volume();

        Box1 ob2 = new Box1(2, 3, 4, 10);
        ob2.volume();
    }
}
