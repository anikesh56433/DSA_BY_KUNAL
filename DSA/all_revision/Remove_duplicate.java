package all_revision;

import java.util.*;

public class Remove_duplicate {

    public static void main(String args[])
    {


        int arr[] = {1,2,3,4,4,3,2} ;

        Set<Integer> s1 = new HashSet<>();

        for(int i = 0 ;i<arr.length;i++)
        {
            s1.add(arr[i]);
        }

        System.out.print(s1);



    }

    public static class Find_duplicate {

        public static void main(String args[])
        {

            int arr[] = {1,2,5,4,7,6,9,2,4};

            int[] arr1 = sorting(arr);

            int i = duplicate_find(arr);

            if(i!=-1){
                System.out.println("Duplicate find at index at "+ i);
            }
            else{
                System.out.println("No duplicate found");
            }


        }

        public static int duplicate_find(int arr[]){

            for(int i = 1 ; i<arr.length ; i++){

                if(arr[i-1]==arr[i]){
                    return i ;
                }

            }
            return -1 ;

        }

        // sorting for duplicate element

        public static int[] sorting(int arr[])
        {
         for(int i = 0 ; i <arr.length; i++)
         {
             for(int j = i+1 ; j<arr.length ; j++){
                 if(arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i]= arr[j];
                     arr[j] = temp ;
                 }
             }
         }
         return arr ;
        }
    }
}
