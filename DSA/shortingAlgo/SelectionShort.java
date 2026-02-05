package shortingAlgo;

import java.util.Arrays;

public class SelectionShort {

    public static int[] selectionSort(int arr[])
    {
        for(int i = 0 ; i< arr.length-1 ; i++)
        {
            int mn= i;

            for(int j = i+1 ; j< arr.length ;j++)
            {
                if(arr[j]<arr[mn])
                {
                    mn = j ;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mn];
            arr[mn] = temp;
        }

        return  arr ;
    }





    public static void main(String[] args) {

        int arr [] = {7,5,2,36,7,3,2,5,79,12};

        int[] ans = selectionSort(arr);

        System.out.println(Arrays.toString(ans));


    }
}
