package ArraySolution;

import java.util.Arrays;

public class LeftRotationByOne {

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7};
        int  firstEle = arr[0];
        for(int  i =0 ; i< arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1] =firstEle;

        System.out.println(Arrays.toString(arr));
    }
}
