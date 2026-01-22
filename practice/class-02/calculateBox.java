// Create Box class and define 3 private attributes height, width and depth and calculate volume of 2 boxes.

class Box{
    private int height;
    private int width;
    private int depth;

    void set (int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void show(){
        System.out.println("Height: "+height+" Width: "+width+" Depth: "+depth);
        System.out.println("Volume: " + (height*width*depth));
    }
}
public class calculateBox {
    public static void main (String args[]){
        Box b1 = new Box();
        Box b2 = new Box();

        b1.set(5, 9, 10);
        b1.show();

        b2.set(3, 2, 6);
        b2.show();

    }
}
