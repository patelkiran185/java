class java1 {
    public static void myMethod(int num){
        System.out.println("This is my method with integer: " + num);
    }
    public static void main(String args[]){
        @SuppressWarnings("deprecation")
        Integer num=new Integer(100);
        myMethod(num);
        @SuppressWarnings("deprecation")
        Integer inum=new Integer(5);
        int num1=inum;
        System.out.println(num1);
    }
}

