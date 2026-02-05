package Array50;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int arr [] = {1,0,3,0,4,0,5,0,6,0,7,-2};

        int index=  0 ;

        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++] = arr[i];
            }
        }

        for(int i  = index; i<arr.length;i++)
        {
            arr[i]  =0;
        }

        System.out.println(Arrays.toString(arr));

    }
}
