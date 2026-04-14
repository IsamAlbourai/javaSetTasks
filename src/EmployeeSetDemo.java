import java.util.Set;
import java.util.HashSet;

public class EmployeeSetDemo {

    public static void main(String[] args) {

        Set<Integer> employeeIDs = new HashSet<>();

        employeeIDs.add(301);
        employeeIDs.add(302);
        employeeIDs.add(303);
        employeeIDs.add(304);
        employeeIDs.add(305);

        System.out.println("Initial Employee IDs:");
        System.out.println(employeeIDs);

        employeeIDs.add(303);

        System.out.println("After attempting to add duplicate (303):");
        System.out.println(employeeIDs);

        boolean exists = employeeIDs.contains(302);
        System.out.println("Does 302 exist? " + exists);

        employeeIDs.remove(304);

        System.out.println("After removing 304:");
        System.out.println(employeeIDs);

        int size = employeeIDs.size();
        System.out.println("Number of employee IDs: " + size);

        employeeIDs.clear();

        System.out.println("After clearing the set:");
        System.out.println(employeeIDs);

        System.out.println("Final size: " + employeeIDs.size());

        // add(): adds elements, duplicates are ignored
        // contains(): checks if an element exists
        // remove(): deletes an element
        // size(): returns number of elements
        // clear(): removes all elements from the set
    }
}