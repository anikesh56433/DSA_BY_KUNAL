package Array50;

import java.util.Arrays;

public class RotateByK {

    public static void main(String[] args) {

        int arr[]= {1,24,6,5,7,9,8,2,1};
        int k =4 ;
        int n  = arr.length;

        int temp[]  =new int[n];

        for(int i = 0 ; i < n;i++)
        {
            temp[i] = arr[(i+k)%n];
        }
        System.out.println(Arrays.toString(temp));
    }
}
