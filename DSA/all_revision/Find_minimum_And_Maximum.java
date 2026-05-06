package all_revision;

public class Find_minimum_And_Maximum {

    public static void main(String args[])
    {
        int arr[] = {2,1,5,7,11,606,44,33,22,8,34,23};

        int min = minimum_element(arr);
        int max = maximum_element(arr);

        System.out.println(min+ " is  minimum number");
        System.out.println(max+ " is  maximum number");
    }


    public static int minimum_element(int arr[]){
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length; i ++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }


    public static int maximum_element(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length; i ++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
