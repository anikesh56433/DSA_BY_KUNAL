package Ab_DigiFlex.array;

import java.lang.reflect.Array;
import  java.util.* ;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[]  ={1,2,3,4,5,67,8,1,2,34} ;


        Set<Integer> set = new HashSet<>() ;

        for(int i = 0 ; i<arr.length ; i++)
        {
            set.add(arr[i]);
        }

        System.out.println(Arrays.toString(arr));


    }
}
