package Java_Internal;
import java.util.*;
public class Gapfull {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(gapful(n));
        
    }
    public static int gapful(int n){
        if (n<100){
            return 100;
        }
        else if(isGapful(n)){
            return n;
        }else{
            int lo=n-1;
            int up=n+1;
            while(true){
                if(isGapful(lo)){
                    return lo;
                }else if(isGapful(up)){
                    return up;
                }
                lo--;
                up++;
            }
        }
    }
    private static boolean isGapful(int n){
        String s=Integer.toString(n);
        int div=Integer.parseInt(s.charAt(0)+""+s.charAt(s.length()-1));
        return n%div==0;
    }
}
