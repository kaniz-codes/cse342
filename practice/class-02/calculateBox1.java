//initialize using constructor
class Box{
    private int height, width, depth;

    Box(){
        this.height = 5;
        this.width = 2;
        this.depth = 3;
    }
    Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void show(){
        System.out.println("Height: "+height+" Width: "+width+" Depth: "+depth);
        System.out.println("Volume: " + (height*width*depth));
    }
}
public class calculateBox1 {
    public static void main (String args[]){
        Box b1 = new Box();
        Box b2 = new Box(3, 2, 1);

        b1.show();
        b2.show();

    }
}
