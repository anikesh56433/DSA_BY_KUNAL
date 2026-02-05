package Ab_DigiFlex.array;

import java.util.Arrays;

public class Kth_Smallest_Elements {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 8, 44, 22, 99, 88, 9, 0};

        int kth = 5;

        Arrays.sort(arr);
        System.out.println(arr[kth - 1]);
    }
}
