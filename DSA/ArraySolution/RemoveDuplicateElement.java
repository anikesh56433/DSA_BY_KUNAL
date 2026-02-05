package ArraySolution;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        int arr[]={1,2,2,3,3,4,4};

        for(int i = 0 ;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set);
        System.out.println(set.size());

//        if (nums.length == 0) return 0;
//
//        int i = 0;
//
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//
//        return i + 1;  // new length


    }
}
