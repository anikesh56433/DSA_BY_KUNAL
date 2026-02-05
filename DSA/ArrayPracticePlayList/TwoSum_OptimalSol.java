package ArrayPracticePlayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum_OptimalSol {
    public static int[] twoSum(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int dif = target - arr[i];
            if (!map.containsKey(dif)) {
                map.put(arr[i], i);
            } else {
              return new int[]{map.get(dif),i};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 3, 5, 87, 5, 3, 5, 87, 4};
        int target = 9;

        int[] ints = twoSum(arr, target);

        System.out.println(Arrays.toString(ints));
    }
}
