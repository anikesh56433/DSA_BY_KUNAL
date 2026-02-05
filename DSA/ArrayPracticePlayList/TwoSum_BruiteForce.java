package ArrayPracticePlayList;

import java.util.Arrays;

public class TwoSum_BruiteForce {

    public static int[] twoSum(int arr[] , int target)
    {

        for(int i=0;i<arr.length;i++)
        {
              int dif= target-arr[i];
            for(int j= 0 ;j<arr.length;j++)
            {
              

                if(dif==arr[j])
                {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        
        int arr[]={2,7,4,3,8,7};
        int  target = 9;

         int result[]= twoSum(arr, target);

         System.out.println(Arrays.toString(result));

    }
    
}