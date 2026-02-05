package Ab_DigiFlex.array;

import java.util.HashMap;
import  java.util.Map;
public class Frequency_of_each_elements {

    public static void main(String[] args) {

        int arr[] = {1,1,2,4,5,6} ;


        Map<Integer ,Integer> map = new HashMap<>() ;

         for(int i : arr){


             if(map.containsKey(i)) {
                 map.put(i , map.get(i)+1);
             }else{
                 map.put(i,1);
             }
         }
        System.out.println(map);


    }


}
