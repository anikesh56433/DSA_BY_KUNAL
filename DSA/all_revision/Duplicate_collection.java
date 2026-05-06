package all_revision;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_collection {

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,5,6,7,6,9,4};

        Map<Integer,Integer> map = new HashMap<>();

        // ---- Correct frequency counting ----
        for(int i = 0 ; i < arr.length ; i++){

            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

        // ---- Print only duplicates ----
        System.out.print("Duplicate elements: ");

        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                System.out.print(key + "  ");
            }

        }
    }
}
