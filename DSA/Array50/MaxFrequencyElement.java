package Array50;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement {

    public static void main(String[] args) {

        int arr[]= {1,2,3,2,3,5,2,4,6,7,2,4,2556,7,3,3,3};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ;i<arr.length;i++)
        {
            int key = arr[i];
            if(map.containsKey(key))
            {
                map.put(key , map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }

        int maxFre = 0 ;
        int maxFreEle = -1;

        for(int i : map.keySet())
        {
            if(map.get(i)>maxFre)
            {
                maxFre =map.get(i);
                maxFreEle =i;
            }
        }

        System.out.println("Max Frequency Element is "+ maxFreEle);
    }
}
