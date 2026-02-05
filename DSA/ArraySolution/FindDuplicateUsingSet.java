package ArraySolution;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {

    public  static int findDuplicate(int arr[])
    {

        int sum = 0 ;
        for(int i:arr)
        {
            sum = sum + i ;
        }
        Set<Integer> set = new HashSet<>();

        for(int i:arr )
        {
            set.add(i);
        }
        Integer setSum = 0 ;
        for(Integer a :set)
        {
            setSum = setSum +a;
        }

        return sum -setSum;


    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,5};

        int duplicate = findDuplicate(arr);

        System.out.println(duplicate);


    }
}
