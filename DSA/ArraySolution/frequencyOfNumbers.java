package ArraySolution;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfNumbers {

    public  static  void frequencyOfEachNumbers(int arr[])
    {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i <arr.length;i++)
        {

            int key = arr[i];
            if(map.containsKey(key))
            {
                map.put(key , map.get(key)+1);
            }
            else {
                map.put(key, 1);
            }

        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,3,2,3,4,4,5,5,5,6,7};

        frequencyOfEachNumbers(arr);

    }
}
