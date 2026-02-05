package Ab_DigiFlex.array;
import  java.util.*;


public class Find_All_duplicates {

    public static void main(String[] args) {


        int arr[] = {1,1,2,4,5,7,9,7,5,2,12,4,7,8,2};

        List<Integer> seen= new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>() ;

        for(int a : arr)
        {
            if(seen.contains(a))
            {
              if(duplicate.contains(a)){

              }
              else {
                  duplicate.add(a);
              }
            }
            else {
                seen.add(a);
            }
        }

        System.out.println(duplicate);
        System.out.println(seen);



    }




}
