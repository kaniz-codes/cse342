## Passing Object as Parameter & returning an object from a method.

```java
class Add{
    int a, b;

    Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    boolean get(Add ob){
        if(ob.a == a && ob.b == b){
            return true;
        }
        else{
            return false;
        }
    }

    Add back(Add ob){
        Add temp = new Add(5,6);
        return temp;
    }

    Add back1(Add ob){
        Add temp = new Add(24,45);
        temp.a = temp.a + ob.a;
        temp.b = temp.b + ob.b;
        return temp;
    }
}
public class returnObject {
    public static void main(String[] args) {
        Add ob1 = new Add(1, 2);
        Add ob2 = new Add(3, 1000);
        System.out.println(ob1.get(ob2));

        Add ob3 = ob2.back(ob2);
        Add ob4 = ob2.back1(ob2);

        System.out.println(ob3.a + ob3.b);
        System.out.println(ob4.a + ob4.b);
    }
}
```