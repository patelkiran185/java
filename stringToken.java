import java.util.StringTokenizer;

public class stringToken {
      public static void main(String[] args) {
        String str = "The StringBuilder class in Java";

        // Using space as the delimiter
        StringTokenizer st1 = new StringTokenizer(str, " ");
        System.out.println("Total number of tokens with space as the delimiter: " + st1.countTokens());
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        // Using 'in' as the delimiter
        StringTokenizer st2 = new StringTokenizer(str, "in");
        System.out.println("\nTotal number of tokens with 'in' as the delimiter: " + st2.countTokens());
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // Using 'in' as the delimiter and returning the delimiter
        StringTokenizer st3 = new StringTokenizer(str, "in", true);
        System.out.println("\nTotal number of tokens with 'in' as the delimiter and returning the delimiter: " + st3.countTokens());
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
