/*Develop a Java program where a class named Product contains three attributes: productCode, productName, and price.
Include an appropriate constructor for initializing objects in the class.
In the main method create a LinkedList to store Product objects. Insert at least 5 Product objects.
Remove the last Product object.
Display the first Product object without removing it.

 */
import java.util.*;

class ProductItem {
    int productCode;
    String productName;
    double price;

    ProductItem(int productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product Code: " + productCode +
                ", Product Name: " + productName +
                ", Price: " + price);
    }
}
public class product {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<ProductItem> products = new LinkedList<>();

        // Insert 5 Product objects
        products.add(new ProductItem(101, "Laptop", 75000));
        products.add(new ProductItem(102, "Phone", 25000));
        products.add(new ProductItem(103, "Tablet", 30000));
        products.add(new ProductItem(104, "Headphones", 5000));
        products.add(new ProductItem(105, "Mouse", 800));

        // Remove last product
        products.removeLast();

        // Display first product (without removing)
        System.out.println("First Product:");
        products.getFirst().display();
    }
}

