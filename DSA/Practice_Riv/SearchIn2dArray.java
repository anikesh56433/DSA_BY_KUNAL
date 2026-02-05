package Practice_Riv;

import java.util.Arrays;

public class SearchIn2dArray {

    public static int[] SearchData(int arr[][], int target)
    {

        for(int i = 0 ; i< arr.length;i++)
        {
            for(int j = 0 ; j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j} ;
                }
            }
        }


        return new int[]{-1,-1};
    }


    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3,4},
                {6,7,8,9},
                {9,7,4,10},
        };

        int searchElement = 10;

        int[] ints = SearchData(arr,searchElement);

        System.out.println(Arrays.toString(ints));


    }
}
