package all_revision;

public class Check_Both_array_is_shorted {

    public static void main(String args[])
    {

        int arr[] = {1,2,3,4,5,6};

        int arr1[] = {1,2,3,4,5,6};
        boolean f= true;

        if(arr.length!=arr1.length)
        {
            f= false;
        }


        for(int i = 0 ; i <arr.length;i++)
        {
            if(arr[i]!=arr1[i])
            {
               f= false;
            }
        }

        if(f)
        {
            System.out.println("Arrays are equals");
        }
        else{
            System.out.println("Arrays are not equals");
        }
    }
}
