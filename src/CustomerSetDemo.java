import java.util.Set;
import java.util.HashSet;

public class CustomerSetDemo {

    public static void main(String[] args) {

        Set<Integer> customerIDs = new HashSet<>();

        customerIDs.add(101);
        customerIDs.add(102);
        customerIDs.add(103);
        customerIDs.add(104);
        customerIDs.add(105);

        System.out.println("Customer IDs after initial addition:");
        System.out.println(customerIDs);

        customerIDs.add(103);

        System.out.println("\nCustomer IDs after attempting to add duplicate:");
        System.out.println(customerIDs);
    }
}
