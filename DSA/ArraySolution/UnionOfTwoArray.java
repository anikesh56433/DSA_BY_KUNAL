package ArraySolution;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public  static Set<Integer> unionOfArrays(int arr1[], int arr2[])
    {
        Set<Integer> set = new HashSet<>();
        for(int i:arr1)
        {
            set.add(i);
        }
        for(int i:arr2)
        {
            set.add(i);
        }
        return set;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,4,6,7};
        int arr2[] ={1,2,3,4,5,6,7,8};
        Set<Integer> set = unionOfArrays(arr1, arr2);
        System.out.println(set);
    }
}

