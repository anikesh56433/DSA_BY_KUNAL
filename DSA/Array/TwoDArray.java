package Array;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        
        int arr[][] = new int[3][];
        int arr2[][] = {
            {1,2,3,54},
            {1,2,3,54},
            {1,2,3,54},
        };
        System.out.println(Arrays.toString(arr));

        for(int row= 0 ;row<arr2.length;row++)
        {
            System.out.println(Arrays.toString(arr2[row]));
        }

    }
    
}
