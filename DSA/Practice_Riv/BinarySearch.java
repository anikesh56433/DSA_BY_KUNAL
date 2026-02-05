package Practice_Riv;

public class BinarySearch {

    public  static int binarySearch(int arr[] ,int target )
    {

        int start  = 0 ;
        int end = arr.length ;

        while(start<=end)
        {
            int mid = (start+end)/ 2 ;

            if(arr[mid] == target)
            {
              return  mid ;
            }
            else  if (target> arr[mid]){

                start = mid +1 ;

            }
            else {
                end = mid -1 ;
            }
        }

        return -1 ;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,8,9,12,34,56} ;

       int target = 12 ;

        int i = binarySearch(arr,target);

        System.out.println("Element fount at Index "+i);

    }
}
