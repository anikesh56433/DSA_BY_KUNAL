package ArraySolution;
//Left Rotate Array by One Position

import java.util.Arrays;

public class RigthRotationByoner {

    public  static  int[] leftRotateByOne(int arr[])
    {

        int firstEle = arr[0];

        int n = arr.length ;

        for(int i = 0 ; i<n-1;i++)
        {
            arr[i]= arr[i+1];
        }
        arr[n-1]= firstEle ;

        return arr;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        int[] ints = leftRotateByOne(arr);
        System.out.println(Arrays.toString(ints));


    }
}
