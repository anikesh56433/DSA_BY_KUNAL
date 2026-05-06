package all_revision;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoArrays {

    public static void main(String args[])
    {
        int arr[] = {1,2,3,3,4,5,6};
        int arr1[] = {1,2,3,56,7,89};


        Set<Integer> s1 = new HashSet<>();

        for(int a: arr) s1.add(a);

        for(int a: arr1){
            if(s1.contains(a))
            {
                System.out.print(a+" ");
            }
        }
    }
}
