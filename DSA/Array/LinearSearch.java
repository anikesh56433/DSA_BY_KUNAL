package Array;

import java.net.StandardSocketOptions;

public class LinearSearch {

    public static int linearSerchM(int arr[], int target)
    {


        for(int  i =0  ;i<arr.length;i++)
        {
            if(arr[i]== target)
            {
                return i ;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
   int arr[]={1,2,3,57,89,0,6,34,3,7,9,0,6,35,8};
   int target =8;
      int output = linearSerchM(arr, target);
      System.out.println("Array lement Fount at Index "+ output);


    }
    
}
