package Anikesh_practice;

import java.util.ArrayList;
import java.util.List;

public class Find_Duplicates {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,6,78,5,4,2,1,545,6,9,5};

        List<Integer> seen = new ArrayList<>();

        List<Integer> duplicate = new ArrayList<>();

        for(int i: arr)
        {
            if(seen.contains(i))
            {
                duplicate.add((i));

            }else {
                seen.add((i));
            }
        }

        System.out.println(duplicate);

    }
}
