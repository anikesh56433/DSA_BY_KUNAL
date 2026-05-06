package all_revision;

import java.util.HashSet;
import java.util.Set;

public class Union_of_Two_Array {
    
    public static void main(String ARGS[]){

        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,3,6};

        Set<Integer> s1 = new HashSet<>();

        for(int a: arr) s1.add(a);

        for(int a: arr1) s1.add(a);

        System.out.println(s1);


    }
}
