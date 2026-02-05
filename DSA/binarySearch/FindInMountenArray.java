package binarySearch;

public class FindInMountenArray {


     public static int firstHaf(int arr[] , int target  , int peakElement)
     {

         int start = 0 ;
         int end = peakElement;

         while(start<=end)
         {
             int mid  = (start + end ) / 2 ;

             if(arr[mid]== target)
             {
                 return mid;
             }
             else if(target >arr[mid])
             {
                 start = mid+1 ;
             }
             else {
                 end = mid-1 ;
             }
         }
         return  -1 ;

     }

    public static int secondHaf(int arr[] , int target  , int peakElement)
    {

        int start = peakElement ;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid  = (start + end ) / 2 ;

            if(arr[mid]== target)
            {
                return mid;
            }
            else if(target >arr[mid])
            {
                start = mid+1 ;
            }
            else {
                end = mid-1 ;
            }
        }
        return  -1 ;

    }
    public static int findPeakElement(int arr[]){

        int start  = 0 ;
        int end = arr.length-1;

        while(start<end)
        {
            int mid= (start+end)/2;
            if(arr[mid]>arr[mid+1])
            {
                end= mid;
            }
            else {
                start = mid+1;
            }


        }
        return start ;
    }




    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,5,4,3,1};

        int target = 7 ;

        int peakElement = findPeakElement(arr);


        int i = firstHaf(arr, target, peakElement);

        if(i!=-1)
        {
            System.out.println("Element At  index Number :"+ i  );
        }
        else
        {
            int i1 = secondHaf(arr, target, peakElement);

            System.out.println("Element At  index Number :"+ i1 );

        }


    }
}
