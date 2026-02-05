package Practice_Riv;

public class CheckArrayIsShortedOrNot {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,5,6,7,8};
        boolean f= true ;

        for(int  i =  1 ;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                f=false ;
                break;
            }
        }
        if(f)
        {
            System.out.println("Array Is shorted");
        }
        else {
            System.out.println("Array is not shorted ");
        }


    }
}
