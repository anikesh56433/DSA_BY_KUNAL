package Array50;

public class CheckArraysEqual {


    public static boolean checkArrayIsEqualOrNot(int arr[] , int arr1[]) {

        if(arr.length !=arr1.length)
        {
            return  false ;
        }

        for(int i =  0; i <arr.length;i++)
        {
            if(arr[i]!=arr1[i])
            {
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7};
        int arr1[]={1,2,3,4,5,6,7};
        boolean b = checkArrayIsEqualOrNot(arr, arr1);

        if (b)
        {
            System.out.println("Both array are same");
        }
        else {
            System.out.println("Both array are not same ");
        }

    }
}
