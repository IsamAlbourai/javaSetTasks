import java.util.Set;
import java.util.HashSet;

public class CheckSetDemo {

    public static void main(String[] args) {

        Set<Integer> employeeIDs = new HashSet<>();

        employeeIDs.add(201);
        employeeIDs.add(202);
        employeeIDs.add(203);
        employeeIDs.add(204);
        employeeIDs.add(205);

        System.out.println("Employee IDs:");
        System.out.println(employeeIDs);

        boolean exists1 = employeeIDs.contains(203);
        System.out.println("Is 203 in the set? " + exists1);

        boolean exists2 = employeeIDs.contains(210);
        System.out.println("Is 210 in the set? " + exists2);

    }
}
