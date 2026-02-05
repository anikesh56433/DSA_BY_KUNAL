package RivisionDsa;

import java.util.Arrays;

public class SearchIn2dArray {

    public static  int[] searchIn2d(int arr[][]  ,int target)
    {
        int start= 0 ;
        int end = arr[0].length-1;

        while(start<= arr.length && end>=0)
        {
            if(arr[start][end]== target)
            {
                return  new int[]{start , end};
            }
            if( target > arr[start][end])
            {
                start++;
            }
            else {
                end--;
            }
        }
        return  new int[]{-1 , -1};


    }


    public static void main(String[] args) {


        int[][] arr = {
                {1,2,3,4},
                {4,5,6,7},
                {8,9,11,12},

        };

        int target = 12;

        int[] ints = searchIn2d(arr, target);

        System.out.println(Arrays.toString(ints));


    }
}




