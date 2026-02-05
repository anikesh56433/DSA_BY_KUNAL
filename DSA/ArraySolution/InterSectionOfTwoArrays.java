package ArraySolution;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoArrays {

    public  static Set<Integer> findInterSection(int arr1[] , int arr2[])
    {
        Set<Integer> set = new HashSet<>();

        for(int i:arr1)
        {
            set.add(i);
        }

        Set<Integer> result = new HashSet<>();
        for(int i = 0 ; i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                result.add(arr2[i]);
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        int arr[]= {1,3,4,5,5};

        int arr1[]= {1,2,3,5,5};

        Set<Integer> interSection = findInterSection(arr, arr1);

        System.out.println(interSection);


    }
}
