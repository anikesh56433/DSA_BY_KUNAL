package all_revision;

public class Second_Largest {

    public static void main(String  args[])
    {
        int arr[] = {13,2,5,4,8,6,9};
        int first_largest = 0 ;
        int second_largest = 0 ;

        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]>first_largest)
            {
                second_largest = first_largest;
                first_largest = arr[i];

            }

            if(arr[i]>second_largest & first_largest >arr[i])
            {
                second_largest = arr[i];
            }
        }

        System.out.println(second_largest);


    }
}
