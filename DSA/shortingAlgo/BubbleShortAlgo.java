package shortingAlgo;

import java.util.Arrays;

public class BubbleShortAlgo {

    public static int [] bubbleShort(int arr[])
    {
        for(int i = 0 ; i <arr.length;i++)
        {
            for(int j = 1 ; j< arr.length;j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return  arr;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,54,2,-4,65,6,23,1};

        int[] arr1 = bubbleShort(arr);

        System.out.println(Arrays.toString(arr1));


    }
}
