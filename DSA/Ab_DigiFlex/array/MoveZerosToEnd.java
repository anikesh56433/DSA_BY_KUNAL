package Ab_DigiFlex.array;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int arr[] = {1,2,40,4,2,0,3,0,3,1,0,22,0,0 ,3 } ;
        int index = 0 ;

        for(int i = 0 ; i< arr.length; i++)
        {

            if(arr[i]!=0){

                arr[index++] = arr[i] ;
            }
        }
        for(int i = index ; i<arr.length;i++)
        {
            arr[i] = 0 ;
        }

        System.out.println(Arrays.toString(arr));

    }
}
