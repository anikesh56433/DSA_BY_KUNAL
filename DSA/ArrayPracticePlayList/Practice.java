package ArrayPracticePlayList;

import java.util.Arrays;

public class Practice {

    public static double midiun(int arr[], int arr1[]) {
        int ar[] = new int[arr.length + arr1.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            ar[k] = arr[i];
            k++;
        }

        for (int i = 0; i < arr1.length; i++) {

            ar[k] = arr1[i];
            k++;
        }

        Arrays.sort(ar);

      //  System.out.println(Arrays.toString(ar));

        if (ar.length % 2 != 0) {
            return ar[ar.length / 2];
        }
        else {
            return (ar[ar.length / 2] + ar[(ar.length / 2) - 1]) / 2.0;

        }
    }


    public static void main(String[] args) {

        int arr[]={1,2};
        int arr2[]={3,4};
        double midiun = midiun(arr, arr2);

        System.out.println(midiun);


    }

}
