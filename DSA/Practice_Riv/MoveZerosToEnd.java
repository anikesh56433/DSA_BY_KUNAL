package Practice_Riv;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int arr[]= {1,0,2,0,3,0,4,0,5,0,4,0,2,7,0,34,6,8,0,-1} ;

        int index= 0 ;

        for(int i = 0 ; i <arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++] = arr[i] ;
            }
        }

        for(int i  = index ; i < arr.length ;i++)
        {
            arr[i]= 0 ;

        }

        System.out.println(Arrays.toString(arr));
    }
}


