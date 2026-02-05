package Array50;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfEveryElement {

    public static void main(String[] args) {

        int arr[]= {1,2,1,3} ;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length;i++)
        {
            int key = arr[i];
            if(map.containsKey(key))
            {
                map.put(key , map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

     //   System.out.println(map);

        for(int i: map.keySet())
        {
            System.out.println(i+"  "  +map.get(i));
        }

    }
}
