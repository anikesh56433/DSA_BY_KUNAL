package Array50;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};

        int ans[]= new int[arr1.length+arr2.length];
        int count = 0 ;
        for(int i = 0 ;i<arr1.length;i++)
        {
            ans[count++] = arr1[i];
        }

        for(int i = 0 ;i<arr1.length;i++)
        {
            ans[count++] = arr2[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
