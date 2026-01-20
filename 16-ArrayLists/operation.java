
import java.util.ArrayList;

public class operation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        //get operation
        int element = list.get(2);
        System.out.println(element);
        //delete/remove operation
        list.remove(0);
        System.out.println(list);
        //set operation
        list.set(2,10);
        System.out.println(list);
        //contains element
        System.out.println(list.contains(5));
        System.out.println(list.contains(2));

        //add at any position using .add function
        list.add(2,4);
        System.out.println(list);
    }
}
