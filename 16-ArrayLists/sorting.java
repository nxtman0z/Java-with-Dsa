import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);//Ascending order sorting
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());//Descending order
        System.out.println(list);
    }
}
