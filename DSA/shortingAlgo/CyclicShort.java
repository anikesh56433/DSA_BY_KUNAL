package shortingAlgo;

import java.util.Arrays;

public class CyclicShort {

    public static void cyclicShort(int arr[])
    {
       int i= 0;
       while(i<arr.length)
       {
           int correct = arr[i]-1;
           if(arr[i]!=arr[correct])
           {
               int temp  = arr[i];
               arr[i]= arr[correct];
               arr[correct]= temp;
           }
           else {
               i++;
           }
       }

    }
    public static void main(String[] args) {

        int arr [] = {5,1,4,2,3,8,7,6};
        cyclicShort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
