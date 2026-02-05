package Practice_Riv;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {


      // If array is Shorted  okay

    public static void main(String[] args) {


        int arr[] = {1,1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8};

        Set<Integer> set  = new HashSet<>();
        for(int i=0 ; i <arr.length ; i++)
        {
            set.add(arr[i]);
        }


        System.out.println(set);


        int index= 0 ;
        int n = arr.length ;
        for(int i = 0 ;i< arr.length-1 ;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[index++] = arr[i+1] ;
            }
        }


        for(int i = 0 ; i<index ; i++)
        {
            System.out.print("  "+ arr[i]);
        }

    }
}
