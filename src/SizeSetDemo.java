import java.util.Set;
import java.util.HashSet;

public class SizeSetDemo {

    public static void main(String[] args) {

        Set<String> departments = new HashSet<>();

        departments.add("HR");
        departments.add("Finance");
        departments.add("IT");
        departments.add("Marketing");
        departments.add("Operations");

        System.out.println("Departments:");
        System.out.println(departments);

        int size1 = departments.size();
        System.out.println("\nNumber of departments: " + size1);

        departments.add("Sales");

        int size2 = departments.size();
        System.out.println("Updated number of departments: " + size2);

        // The size increased after adding a new unique department to the set.
    }
}
