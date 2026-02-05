package Practice_Riv;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement {

    public static void main(String[] args) {


        int arr[]= {1,2,1,2,4,2,4,5,7,12};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i= 0 ; i< arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i] , 1);
            }
        }

        int maxFreQ = 0 ;
        int maxFreElement = 0  ;

        for(int i : map.keySet())
        {
            if(map.get(i)>maxFreQ)
            {
                maxFreQ = map.get(i);
                maxFreElement  = i ;
            }
        }


        System.out.println(maxFreElement);
    }
}
