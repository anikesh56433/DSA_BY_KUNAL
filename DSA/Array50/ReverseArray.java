package Array50;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
