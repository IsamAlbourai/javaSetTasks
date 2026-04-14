import java.util.Set;
import java.util.HashSet;

public class ProductSetDemo {

    public static void main(String[] args) {

        Set<String> productCodes = new HashSet<>();

        productCodes.add("P1001");
        productCodes.add("P1002");
        productCodes.add("P1003");
        productCodes.add("P1004");
        productCodes.add("P1005");

        System.out.println("Initial Product Codes:");
        System.out.println(productCodes);

        productCodes.add("P1006");

        System.out.println("\nAfter Adding One More Product Code:");
        System.out.println(productCodes);

    }
}
