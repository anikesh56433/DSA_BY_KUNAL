package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.contains(30 ));
        System.out.println(list);
      List<Integer> list1 = new ArrayList<>();
      list1.add(10);
      list1.add(20);
      list1.add(30);
      List<Integer> list2 = new ArrayList<>();
      list2.add(10);
      list2.add(20);
      list2.add(30);
      List<List<Integer>> list3 = new ArrayList<>();
      list3.add(list1);
      list3.add(list2);
      System.out.println(list3);
    }
    
}
