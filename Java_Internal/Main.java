package Java_Internal;

import java.util.*;

public class Main {
    @SuppressWarnings("resource")
    //to supress the warnings like resource mangement for resources like Scanner,InputStream and OutputStream
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= n; j++) {
                if (i == (j + 1) * j)
                    System.out.println(i);
            }
        }
    }
}