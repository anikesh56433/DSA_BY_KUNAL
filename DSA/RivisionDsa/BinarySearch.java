package RivisionDsa;

public class BinarySearch {

    public  static int  binarySearch(int arr[] , int target)
    {
        int s  =0 ;
        int e= arr.length-1;
        int mid ;

        while(s<=e)
        {
            mid = (s+e)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                s = mid+1;
            }
            else {
                e= mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]= {9,8,7,6,5,4,3,2,1};

        int target = 7;

        int i = binarySearch(arr, target);

        if(i>0)
        {
            System.out.println("Element fount at Index "+i );
        }
        else {
            System.out.println("Element Not Found");
        }

    }


}
