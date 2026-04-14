import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo2 {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> employees = new HashSet<>();

        // Add employee names to the set
        employees.add("Ali");
        employees.add("Sara");
        employees.add("Omar");
        employees.add("Noor");
        employees.add("Maha");

        // Display initial employee set
        System.out.println("Initial employees:");
        System.out.println(employees);

        // Add one more employee
        employees.add("Hassan");

        // Display set after adding a new employee
        System.out.println("\nAfter adding Hassan:");
        System.out.println(employees);

        // Try adding a duplicate employee
        boolean duplicateAdded = employees.add("Ali");

        // Display set after duplicate attempt
        System.out.println("\nAfter trying to add duplicate 'Ali':");
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(employees);

        // Explain duplicate behavior
        System.out.println("\nNote: Set allows only unique employee names.");

        // Check if an employee exists
        boolean exists1 = employees.contains("Sara");

        // Display first contains check
        System.out.println("\nCheck if Sara exists: " + exists1);

        // Check for a non-existing employee
        boolean exists2 = employees.contains("Khalid");

        // Display second contains check
        System.out.println("Check if Khalid exists: " + exists2);

        // Remove an employee
        employees.remove("Omar");

        // Display set after removal
        System.out.println("\nAfter removing Omar:");
        System.out.println(employees);

        // Optional extra removal
        employees.remove("Noor");

        // Display set after second removal
        System.out.println("\nAfter removing Noor:");
        System.out.println(employees);

        // Display current size of set
        System.out.println("\nCurrent number of employees: " + employees.size());

        // Add a new employee
        employees.add("Yousef");

        // Display updated set
        System.out.println("\nAfter adding Yousef:");
        System.out.println(employees);

        // Display new size
        System.out.println("Updated size: " + employees.size());

        // Clear all employees from the set
        employees.clear();

        // Display set after clearing
        System.out.println("\nAfter clearing all employees:");
        System.out.println(employees);

        // Confirm set is empty
        System.out.println("Final size: " + employees.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
