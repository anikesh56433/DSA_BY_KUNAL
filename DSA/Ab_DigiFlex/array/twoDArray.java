package Ab_DigiFlex.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twoDArray {

    public static void main(String args[])
    {

        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {53,2,1,7}
        };
        for(int []a : arr){

            System.out.print(Arrays.toString(a));
            System.out.println();

        }


        System.out.print(Arrays.toString(arr));

    }
}
