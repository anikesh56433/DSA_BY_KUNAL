package Ab_DigiFlex.array;

import java.util.Arrays;

public class RotateBykthIndex {

    public static  int[] rotatekth(int arr[] , int kth){


        int temp[] = new int[arr.length] ;
        int size   = arr.length;

        for(int i = 0 ; i < arr.length ; i++)
        {
            temp[i] = arr[(i+kth)%size] ;
        }

        return  temp ;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8} ;
        int kth =3 ;

        int[] rotatekth = rotatekth(arr, kth);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(rotatekth));

    }
}
