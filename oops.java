public class oops {
    public class Dog{
        String breed;
        int age;
        Dog(){
            breed="labrdor";
            age=7;
        }
        public void printDog(){
            System.out.println(breed);
            System.out.println(age);
        }

    }
    public class SuperDog extends Dog{
        String color;
        SuperDog(){
            super();
            color="black";
        }
        public void printSuperDog(){
            super.printDog();
            System.out.println(color);
        }
    }
    public static void main(String[] args){
        oops oo=new oops();
        SuperDog sd=oo.new SuperDog();
        sd.printSuperDog();

    }
}

