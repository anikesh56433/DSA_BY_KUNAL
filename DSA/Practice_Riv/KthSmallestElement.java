package Practice_Riv;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {

        int arr[] = {1,4,2,4,7,9,3,11,45,21};
       int k= 6;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
