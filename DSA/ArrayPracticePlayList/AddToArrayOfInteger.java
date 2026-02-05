package ArrayPracticePlayList;

import java.util.ArrayList;
import java.util.List;


public class AddToArrayOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int num1=0;
     for(int i=0;i<num.length;i++)
     {

     }

        num1=num1+k;

        String str = String.valueOf(num1);
        int[] digits = new int[str.length()];

        for(int i=0;i<digits.length;i++)
        {
            digits[i]=str.charAt(i);
        }


        List<Integer> list = new ArrayList<>();
        for (int nums : digits) {
            list.add(nums);
        }


        return list;
    }

    public static void main(String[] args) {

        int arr[]={1,2,0,0};
        int k=34;
        List<Integer> integers = addToArrayForm(arr, k);

        System.out.println(integers);

    }
}
