package Ab_DigiFlex.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rigth_rotation_byOne {

    public static void main(String[] args) {

        int arr[] = {1,2,4,5,7,8} ;

        int temp = arr[arr.length-1];

        for(int i = arr.length-1;i>0 ; i--)
        {
            arr[i]  =arr[i-1];

        }

        arr[0 ] = temp ;

        System.out.println(Arrays.toString(arr));


    }
}
