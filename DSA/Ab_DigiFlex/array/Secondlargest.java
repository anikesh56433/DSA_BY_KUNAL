package Ab_DigiFlex.array;

import java.util.Arrays;

public class Secondlargest {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,567,9,9,34} ;

        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);
    }
}
