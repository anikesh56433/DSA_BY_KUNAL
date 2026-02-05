package binarySearch;

public class SeilingOfNumber {

    public static int seilingOfNumber(int arr[] , int target)
    {
        int start = 0 ;
        int end = arr.length-1;
        int mid =0;

        if(target > arr[arr.length-1])
        {
            return -1;
        }


        while(start<=end)
        {
            mid= (start+ end )/ 2;

            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(target>arr[mid])

            {
             start = mid +1;
            }
            else {
                end= mid-1;
            }
        }

       return   arr[start];

    }

    public static void main(String[] args) {

        int arr[]={2,4,6,8};

        int target = 15;


        int i = seilingOfNumber(arr, target);

        System.out.println(i);

    }
}
