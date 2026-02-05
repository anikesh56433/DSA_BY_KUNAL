package shortingAlgo;

import java.util.Arrays;

public class InsertionSort {

    public static int [] insertionShort(int arr[])
    {
        for(int i = 0;i<arr.length-1 ; i++)
        {
            for(int j= i+1 ; j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
                else {
                    break;
                }
            }
        }
        return  arr;
    }

    public static void main(String[] args) {

        int arr[]={86,3,2,25,7,2,1,4,6,7};

        int[] ans = insertionShort(arr);

        System.out.println(Arrays.toString(ans));

    }


}
