import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo2 {

    public static void main(String[] args) {

        // Create a Set using HashSet
        Set<String> products = new HashSet<>();

        // Add product names to the set
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        products.add("Keyboard");
        products.add("Mouse");

        // Display all products
        System.out.println("Initial product set:");
        System.out.println(products);

        // Try adding a duplicate product
        boolean added = products.add("Laptop");

        // Display set after duplicate attempt
        System.out.println("After trying to add duplicate:");
        System.out.println("Duplicate added? " + added);
        System.out.println(products);

        // Check if a product exists in the set
        boolean exists = products.contains("Mouse");

        // Display contains result
        System.out.println("Check if Mouse exists: " + exists);

        // Remove a product from the set
        products.remove("Headphones");

        // Display set after removal
        System.out.println("After removing a product:");
        System.out.println(products);

        // Display number of products
        System.out.println("Size of product set: " + products.size());

        // Clear all products from the set
        products.clear();

        // Display set after clearing
        System.out.println("After clearing:");
        System.out.println(products);

        // Confirm set is empty
        System.out.println("Final size: " + products.size());
    }
}
