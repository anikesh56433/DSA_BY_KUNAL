package Array50;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,1,3,5,2,2,4,6,8,42,45,9};

        List<Integer> seen  =new ArrayList<>();
        List<Integer> duplicate =new ArrayList<>();

        for(int a: arr)
        {
            if(seen.contains(a))
            {
                duplicate.add(a);
            }
            else {
                seen.add(a);
            }
        }

        System.out.println(duplicate);
        System.out.println(seen);

    }
}
