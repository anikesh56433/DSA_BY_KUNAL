package binarySearch;

public class FinfInRotetedArray {

     public static int search (int arr[] , int target , int pivot ) {
         if (pivot == -1) {
             return binnarySearch(arr, target, 0, arr.length - 1);
         }
         if (arr[pivot] == target) {
             return pivot;
         }

         if (target >= arr[0]) {
             return binnarySearch(arr, target, 0, pivot - 1);
         }

             return binnarySearch(arr, target, pivot+1, arr.length - 1);
     }
     public  static int binnarySearch(int arr[] , int target , int start , int end)
     {
           while(start <= end)
           {
               int mid = (start+end)/2;
               if(arr[mid]== target)
               {
                   return  mid ;
               }
               else if(target> arr[mid])
               {
                   start =mid+1;
               }
               else {
                   end= mid-1;
               }
           }
           return -1;
     }

    public static int findPivot(int arr[])
    {
        int start =0 ;
        int end = arr.length-1;
         while(start<=end)
         {
             int mid = (start+end)/2;
             if(mid < end &&  arr[mid]>arr[mid+1])
             {
                 return mid;
             }
             if(mid>start && arr[mid-1]> arr[mid])
             {
                 return mid-1;
             }
             if(arr[start] > arr[mid])
             {
                 end= mid-1;
             }
             else {
                 start= mid+1;
             }
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]= {3,1};
        int target = 1 ;
        int pivot = findPivot(arr);
        System.out.println(pivot);

        int search = search(arr, target, pivot);
        System.out.println(search);


    }
}
