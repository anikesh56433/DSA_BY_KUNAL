package Practice_Riv;


import java.util.HashMap;
import java.util.Map;

public class FreQuencyOfEachElement {

    public static void main(String[] args) {

        int arr[] = {1,1,2,3,4,5,6,7,8,6,3,5,4};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0  ;i<arr.length;i++)
        {
         if(map.containsKey(arr[i]))
         {
             map.put(arr[i], map.get(arr[i])+1);
         }
         else {
             map.put(arr[i],1);
         }
        }




        map.forEach((key,value)-> System.out.println("Element :"+key+++"  Occerence "+value));
    }

}
