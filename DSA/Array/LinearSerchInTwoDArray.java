package Array;

import java.util.Arrays;

class LinearSerchInTwoDArray  {


    public static int[] findInToD(int arr[][],int target)
    {

        if(arr.length==0)
        {
            return new int []{-1,-1};
        }

        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)
            {
               if(arr[i][j]==target)
               {
                return new int []{i,j};
               }
            }
        }



        return new int []{-1,-1};
    }

    public static void main(String[] args) {

        int arr[][] ={


            {1,3,4687,33,32},
            {3,5,5,7,80},
            {87,6,43,2,45,2},
            {0,89,8,76,5,4,3},
        };

        int target = 76;


       int [] add=  findInToD(arr, target);

       System.out.println(Arrays.toString(add));
        
    }

}