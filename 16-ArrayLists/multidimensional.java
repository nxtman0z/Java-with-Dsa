/* import java.util.ArrayList;
public class multidimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainlist.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3); list1.add(4);
        mainlist.add(list1);

        for(int i = 0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = new ArrayList<>();
            for(int j = 0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

    }
}*/

import java.util.ArrayList;

public class multidimensional{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i =1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);

        for(int i =0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0;j<currlist.size();j++ ){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
