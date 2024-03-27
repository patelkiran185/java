// import java.util.Scanner;

// public class HelloWorld {
//     static class Demo{
//         int data=20;
//         static int a=12;
//         void method(){
//             int b=90;
//             System.out.println("Local "+b);
//         }
//     }
//     public enum Color{
//         RED, GREEN, BLUE;
//     }
    
    
//     public static void main(String[] args) {
//         // System.out.println("Hello, world!");
//         // Demo d = new Demo();
//         // d.method();
//         // System.out.println("instance variable " + d.data);
//         // System.out.println("Static " + Demo.a);
//         // float f=10.5f;
//         // int a =(int)f;
//         // System.out.println(f);
//         // System.out.println(a);
//         // int u=10;
//         // int v=56;
//         // u=u+v;
//         // v=u-v;
//         // u=u-v;
//         // System.out.println(u +" "+ v);
//         Color myColor;
//         myColor=Color.RED;
//         System.out.println(myColor);
//         //
    
        


//     }
// }


import java.util.Arrays;
import java.util.Scanner;
class inputarray{
    public static void main(String[] args){
       System.out.println("Array size: ");
       @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[]= new int[size];
       for(int i=0;i<size;i++){
        arr[i]= sc.nextInt();
       }
       int min = Arrays.stream(arr).min().getAsInt();
       int max = Arrays.stream(arr).max().getAsInt();
       System.out.println("Difference is : "+(max-min));

    }
};