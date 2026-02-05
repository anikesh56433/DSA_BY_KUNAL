package all_revision;

import java.util.*;

public class Remove_duplicate {

    public static void main(String args[])
    {


        int arr[] = {1,2,3,4,4,3,2} ;

        Set<Integer> s1 = new HashSet<>();

        for(int i = 0 ;i<arr.length;i++)
        {
            s1.add(arr[i]);
        }

        System.out.print(s1);



    }
}
