import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> flowers = new HashSet<>();

        System.out.println("Adding initial flower names...");

        // Add flower names to the set
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Sunflower");
        flowers.add("Jasmine");

        // Display initial flowers
        System.out.println("Initial flowers:");
        System.out.println(flowers);

        System.out.println("\nAdding one more flower (Daisy)...");
        flowers.add("Daisy");

        // Display after adding new flower
        System.out.println("After adding Daisy:");
        System.out.println(flowers);

        System.out.println("\nTrying to add duplicate flower (Rose)...");
        boolean duplicateAdded = flowers.add("Rose");

        // Display after duplicate attempt
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(flowers);

        // Explain duplicate behavior
        System.out.println("\nNote: Set stores only unique flower names.");

        System.out.println("\nChecking if Lily exists...");
        boolean exists1 = flowers.contains("Lily");

        // Display successful contains check
        System.out.println("Lily exists? " + exists1);

        System.out.println("\nChecking if Orchid exists...");
        boolean exists2 = flowers.contains("Orchid");

        // Display unsuccessful contains check
        System.out.println("Orchid exists? " + exists2);

        System.out.println("\nRemoving Tulip from the set...");
        flowers.remove("Tulip");

        // Display after removal
        System.out.println("After removing Tulip:");
        System.out.println(flowers);

        System.out.println("\nTrying to remove Sunflower...");
        flowers.remove("Sunflower");

        // Display after second removal
        System.out.println("After removing Sunflower:");
        System.out.println(flowers);

        // Display current size
        System.out.println("\nCurrent number of flowers: " + flowers.size());

        System.out.println("\nAdding new flower (Orchid)...");
        flowers.add("Orchid");

        // Display updated set
        System.out.println("After adding Orchid:");
        System.out.println(flowers);

        // Display updated size
        System.out.println("Updated size: " + flowers.size());

        System.out.println("\nClearing all flowers from the set...");
        flowers.clear();

        // Display after clearing
        System.out.println("After clearing:");
        System.out.println(flowers);

        // Confirm final size
        System.out.println("Final size: " + flowers.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
