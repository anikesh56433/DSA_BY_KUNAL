package Array50;

public class CheckSortedArray {

    public static boolean checkShorted(int arr[])
    {


        for(int i = 0 ; i< arr.length-1 ; i++)

        {
            if(arr[i]>arr[i+1])
            {
                return false ;
            }
        }

            return true ;

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 4};

        if (checkShorted(arr))
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

}
