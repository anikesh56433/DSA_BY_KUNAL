package binarySearch;

public class    FindingElementInInfiniteShortedArray {

    public static int ans(int arr[] , int  target)
    {
     int start =0 ;
     int end =0 ;

     while(target>arr[end])
     {
         int  NewStart = end +1;
         end = end +(end-start+1)*2;
         start = NewStart;
     }
        int i = binarySearch(arr, target, start, end);

     return  i ;
    }

    public static  int binarySearch(int arr[] , int target , int  start , int  end )
    {
        while(start<=end)
        {

            int mid= (start+end)/2;

            if(arr[mid]== target)
            {
                return  mid ;
            }
            else if(target> arr[mid])
            {
                start = mid +1;
            }
            else {
                end = mid -1 ;
            }
        }

        return -1 ;

    }


    public static void main(String[] args) {

     int arr[]= {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99};

     int target = 5;

        int ans = ans(arr, target);
        System.out.println(ans);

    }

}
