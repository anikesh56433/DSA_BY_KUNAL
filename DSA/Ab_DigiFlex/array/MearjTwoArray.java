package Ab_DigiFlex.array;

import java.util.Arrays;

public class MearjTwoArray {

    public static void main(String[] args) {
         int arr []  = {1,2,3,4,5} ;
         int arr1 []   = {6,5,4,3,2,1,1} ;

         int final_array[]  = new int[arr.length+arr1.length];
         int index= 0 ;

         for(int i = 0 ; i< arr.length;i++)
         {
             final_array[index++] = arr[i] ;

         }
        for(int i = 0 ; i< arr1.length;i++)
        {
            final_array[index++] = arr1[i] ;

        }

        System.out.println(Arrays.toString(final_array));
    }

}
