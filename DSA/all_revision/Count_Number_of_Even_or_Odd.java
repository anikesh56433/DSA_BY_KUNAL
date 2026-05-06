package all_revision;

public class Count_Number_of_Even_or_Odd {

    public static void main(String agrs[])
    {

        int arr[]= {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66};
        int even_count= 0 ;
        int odd_count = 0 ;

        for(int i = 0 ;i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                even_count++;
            }
            else{
                odd_count++;
            }

        }

        System.out.println(even_count+" is evens    " + odd_count+" odd counts is");
    }
}
