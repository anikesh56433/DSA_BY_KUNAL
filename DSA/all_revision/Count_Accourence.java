package all_revision;

public class Count_Accourence {

    public static void main(String args[])
    {
        int arr[] = {1,2,3,3,3,4,5,7};

        int n = 3 ;
        int count = 0 ;

        for(int i = 0 ; i <arr.length ; i++)
        {
            if(arr[i]==n)
            {
                count++;
            }

        }

        System.out.println(count);
    }
}
