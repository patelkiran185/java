import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class array {
    public static void main(String[] args) {
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be inserted: ");
        int ele =sc.nextInt();
        System.out.println("Enter the position at which the element is to be inserted: ");
        int pos =sc.nextInt();
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < pos) {
                result[i] = arr[i];
            } else if (i == pos) {
                result[i] = ele;
            } else {
                result[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(result));
        //to find duplicate element in an array
        // for(int i=0;i<result.length;i++){
        //     // for(int j=i+1;j<result.length;j++){
        //     //     if(result[i]==result[j]){
        //     //         System.out.println("Duplicate element is: "+result[j]);
        //     //     }
        //     // }
        // }
        Set<Integer> set = new HashSet<Integer>();
        for(int i: result){
            if(!set.add(i)){
                System.out.println("Duplicate element is "+ i);
            }
        }
    }
   
}
