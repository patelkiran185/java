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
    public static void main(String[] args){
        oops oo=new oops();
        Dog d=oo.new Dog();
        d.printDog();

    }
}

