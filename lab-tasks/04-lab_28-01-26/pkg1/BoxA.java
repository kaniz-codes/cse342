package pkg1;
public class BoxA {
    int h, w, d;

   public BoxA(int h, int w, int d){
        this.h = h;
        this.w = w;
        this.d = d;
    }

    public void Calculate() {
        System.out.println("Calculate box: " + (h * w * d));
    }
}
