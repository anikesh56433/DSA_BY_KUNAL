package ArraySolution;

public class LinearSearch {

    public  static int linearSearch(int arr[] , int target)
    {

        for(int i = 1 ;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] =  {1,3,56,8,3,5,8,0,2,33,4,89};
       int  n =33;

        int i = linearSearch(arr, n);
        if(i==-1)
        {
            System.out.println("Element Not Fount In the Array");
        }
        else {
            System.out.println("Element Fount at Index " + i);
        }
    }
}
