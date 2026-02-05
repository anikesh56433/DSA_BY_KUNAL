package Ab_DigiFlex.array;

import java.awt.image.ImageProducer;
import  java.util.* ;

public class maxFrequencyElementElementInArray {

    public static void main(String[] args) {


        int arr[]  = {1,2,3,4,5,6,3,3,3,1,1,1,1} ;
        Map<Integer, Integer> map = new HashMap<>() ;

        for(int a : arr) {

            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }
            else{
                map.put(a, 1) ;
            }
        }

        System.out.println(map);


        int maxFre = 0 ;
        int maxFreEle = -1 ;

        for(int a : map.keySet()){

            if(map.get(a) > maxFre){
                maxFre = map.get(a) ;
                maxFreEle = a ;
            }
        }

        System.out.println("Max FreQuency Element Is : "+ maxFreEle);



    }
}
