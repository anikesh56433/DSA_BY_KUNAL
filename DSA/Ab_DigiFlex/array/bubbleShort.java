package Ab_DigiFlex.array;

import java.util.Arrays;

public class bubbleShort {

    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9,3,1,4,7,-0,22,11} ;

        for(int i = 0 ;i<arr.length ; i++)
        {
            for(int j = 1 ; j< arr.length-i ; j++)
            {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
