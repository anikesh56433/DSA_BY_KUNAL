package ArraySolution;

public class BinarySearch {

    public static  int  binarySearch(int arr[] , int target)
    {
        int start= 0 , end= arr.length-1;
        int mid  ;

        while(start<=end)
        {
            mid  =(start+end)/2;

            if(arr[mid]== target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                    start = mid+1;
            }
            else {
                end= mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,4,5,7,8,9,11,23};
        int target= 11;
        int i = binarySearch(arr, target);

        if(i==-1)
        {
            System.out.println("Element Not Fount In the Array");
        }
        else {
            System.out.println("Element Fount at Index " + i);
        }
    }
}
