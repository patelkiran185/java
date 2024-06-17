public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example 1
        int c1 = 5;
        System.out.println("Input: c = " + c1);
        System.out.println("Output: " + judgeSquareSum(c1)); // true

        // Example 2
        int c2 = 3;
        System.out.println("Input: c = " + c2);
        System.out.println("Output: " + judgeSquareSum(c2)); // false

        // Additional Example
        int c3 = 2147483600;
        System.out.println("Input: c = " + c3);
        System.out.println("Output: " + judgeSquareSum(c3)); // Output should be true or false based on the actual result
    }
}
