import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class removeflLL {
    class Test{
        private List<Integer> l;
        public Test(List<Integer> l){
            this.l=l;
            System.out.println("Original List: "+l);
            l.remove(0);
            System.out.println("List after removing first element: "+l);
            l.remove(l.size()-1);
            System.out.println("List after removing last element: "+l);
            l.clear();
            System.out.println("List after removing all elements: "+l);
        }
    }
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
       Test t = new removeflLL().new Test(l);
       System.out.println("List after removing all elements: "t);



    }
}
