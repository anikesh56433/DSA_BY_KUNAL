package Ab_DigiFlex.array;

import java.util.*;

public class duplicates_set {

    public static void main(String[] args) {
        int arr[] = {1,2,3,54,67,8,56,12,2,4,32,24,6,32,6};

        List<Integer> list = new ArrayList<>();

        Set<Integer> s1 = new HashSet<>() ;

        for(int i = 0 ; i <arr.length ; i++)
        {
            if(list.contains(arr[i])){
                s1.add(arr[i]);
            }
            else {
                list.add((arr[i]));
            }
        }

        System.out.println(s1);
        System.out.println(list);




    }
}
