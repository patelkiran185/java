package Java_Internal;
import java.util.*;
public class maxidiffarr {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])>maxi){
                    maxi=Math.abs(arr[i]-arr[j]);
                }

            }
        }
        System.out.println(maxi);

    }
}
