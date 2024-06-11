public class demo {
    public static void main(String args[]){
        System.out.println("Hello World");
        try{
            int a=10/0;
            System.out.println(a);
            

        }catch(ArithmeticException e){
            System.out.println("ArithmeticException" + e);
        }
    }
}
