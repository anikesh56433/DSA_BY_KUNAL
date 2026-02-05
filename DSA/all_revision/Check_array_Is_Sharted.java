package all_revision;

public class Check_array_Is_Sharted {

    public static void main(String args[])
    {


        int arr[] = {1,2,3,4,5,78,6};
        boolean f = true ;

        for(int  i = 1 ; i<arr.length;i++)
        {

            if(arr[i-1]>arr[i])
            {
                f= false ;
                break;
            }
        }

        if(f)
        {
            System.out.println("Array is shorted");
        }
        else{
            System.out.println("Array is not shorted");
        }

    }
}
