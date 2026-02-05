package twoDMatrix;

import java.util.Arrays;

public class FindIn2DMatRowColShorted {


    public static int[]  search(int[][] arr, int target)
    {
      int start = 0 ;
      int  end = arr[0].length - 1;


        while(start < arr.length  && end >=0)
      {
          if(arr[start][end]== target)
          {

              return  new int []{start , end};
          }
          if(target>arr[start][end])
          {
              start++;
          }
          else {
              end--;
          }

      }
        return  new int []{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,5,6,7},
                {8,9,11,12},

        };

        int target  = 7;

        int[] search = search(arr, target);

        System.out.println(Arrays.toString(search));

    }
}
