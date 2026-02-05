package Practice_Riv;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementInArray {

    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5,6,7,1,2,3,4} ;

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ;i<arr.length;i++)
        {
            if(list.contains(arr[i]))
            {
                System.out.print(arr[i]+"  ");
            }
            else {
                list.add(arr[i]);
            }



        }
        System.out.println();
        System.out.println(list);
    }
}
