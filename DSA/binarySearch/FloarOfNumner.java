package binarySearch;

public class FloarOfNumner {

    public static int floarOfNumber(int arr[] , int target)
    {
        int start = 0 ;
        int end = arr.length-1;

        if(arr[0]>target)
        {
            return -1;
        }

        while(start<=end)
        {
            int mid = (start + end ) / 2;

            if(arr[mid]== target)
            {
                return arr[mid];
            }
            else if(target>arr[mid])
            {
                start= mid+1;

            }
            else {
                end  = mid-1;
            }

        }

        return arr[end];

    }

    public static void main(String[] args) {

        int arr[]= {2,3,5,7,9,12,17,56};

        int target =1;

        int i = floarOfNumber(arr, target);

        System.out.println(i);

    }
}
