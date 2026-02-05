package all_revision;

public class Binary_Search {

    public  static void main(String args[])
    {
        
        int arr []= {1,2,4,6,8,10,12};
        int n = 11 ;

        int i = Binary_Search.binary_search(arr, n);

        if(i==-1)
        {
            System.out.println("Element not present in array");
        }
        else{
            System.out.println("Element present  at index "+ i );
        }


    }
    
    public static int binary_search(int arr[], int n )
    {

        int start = 0 ;
        int end = arr.length-1 ;


        while(start<=end)
        {
            int mid  = (start + end) /2 ;

            if (arr[mid] == n ) {
                return mid;
            }
            else if(arr[mid]<n){
                start = mid+1;
            }
            else{
                end = mid-1 ;
            }
        }
        return -1 ;
    }

}
