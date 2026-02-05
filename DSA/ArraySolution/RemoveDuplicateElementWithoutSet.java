package ArraySolution;

import java.util.Arrays;

public class RemoveDuplicateElementWithoutSet {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 3, 4, 4, 4, 4};
        int n = arr.length;

        if (n < 1) {
            System.out.println("Array is empty.");
            return;
        }

        int temp[] = new int[n];
        int j = 0;

        // Add unique elements except the last one
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element manually
        temp[j++] = arr[n - 1];

        // Print only the valid part
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
