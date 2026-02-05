package Array50;

import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {

        int arr[]= {1,3,6,9,2,45,8};
        int k = 4 ;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
