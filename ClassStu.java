
public class ClassStu{
    public class StudentData{
        private String name;
        private int id;
        private int age;
        private String address;
        private String phone;
        private String email;
        //default constructor
        public StudentData(){
            name = "";
            id = 0;
            age = 0;
            address = "";
            phone = "";
            email = "";
        }
        //parameterised constructor
        public  StudentData(String name,int id,int age,String address,String phone,String email){
            this.name = name;
            this.id = id;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.email = email;
        }
        public void displayData(){
            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
            System.out.println("Age: "+age);
            System.out.println("Address: "+address);
            System.out.println("Phone: "+phone);
            System.out.println("Email: "+email);
        }
    }
    public static void main(String[] args){
        ClassStu outer = new ClassStu();
        ClassStu.StudentData s1 = outer.new StudentData();
        s1.displayData();
        System.out.println("******************");
        ClassStu outer1 = new ClassStu();
        ClassStu.StudentData s2=outer1.new StudentData("John",101,25,"New York","1234567890","q");
        s2.displayData();
    }
}



