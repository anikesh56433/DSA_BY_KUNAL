package Ab_DigiFlex.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueElement {

    public  static  int firstUnick(int arr[])
    {
        Map<Integer,Integer> map = new LinkedHashMap<>() ;

        for(int i:arr)
        {

            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int a : map.keySet())
        {
            if(map.get(a)==1)
            {
                return  a;
            }
        }

        return  -1 ;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,1,2,3,4,8,6} ;

        int i = firstUnick(arr);
        if(i ==-1)
        {
            System.out.println("There is No Unick Numbers");
        }
        else {
            System.out.println(i);
        }


    }
}
