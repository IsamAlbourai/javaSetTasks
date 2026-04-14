import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> fruits = new HashSet<>();

        System.out.println("Adding initial fruit names...");

        // Add fruit names to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grape");

        // Display initial fruits
        System.out.println("Initial fruits:");
        System.out.println(fruits);

        System.out.println("\nAdding one more fruit (Pineapple)...");
        fruits.add("Pineapple");

        // Display after adding new fruit
        System.out.println("After adding Pineapple:");
        System.out.println(fruits);

        System.out.println("\nTrying to add duplicate fruit (Apple)...");
        boolean duplicateAdded = fruits.add("Apple");

        // Display after duplicate attempt
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(fruits);

        // Explain duplicate behavior
        System.out.println("\nNote: Set stores only unique fruit names.");

        System.out.println("\nChecking if Banana exists...");
        boolean exists1 = fruits.contains("Banana");

        // Display successful contains check
        System.out.println("Banana exists? " + exists1);

        System.out.println("\nChecking if Kiwi exists...");
        boolean exists2 = fruits.contains("Kiwi");

        // Display unsuccessful contains check
        System.out.println("Kiwi exists? " + exists2);

        System.out.println("\nRemoving Mango from the set...");
        fruits.remove("Mango");

        // Display after removal
        System.out.println("After removing Mango:");
        System.out.println(fruits);

        System.out.println("\nTrying to remove Orange...");
        fruits.remove("Orange");

        // Display after second removal
        System.out.println("After removing Orange:");
        System.out.println(fruits);

        // Display current size
        System.out.println("\nCurrent number of fruits: " + fruits.size());

        System.out.println("\nAdding new fruit (Strawberry)...");
        fruits.add("Strawberry");

        // Display updated set
        System.out.println("After adding Strawberry:");
        System.out.println(fruits);

        // Display updated size
        System.out.println("Updated size: " + fruits.size());

        System.out.println("\nClearing all fruits from the set...");
        fruits.clear();

        // Display after clearing
        System.out.println("After clearing:");
        System.out.println(fruits);

        // Confirm final size
        System.out.println("Final size: " + fruits.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
