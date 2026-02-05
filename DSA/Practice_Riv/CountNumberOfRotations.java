package Practice_Riv;

public class CountNumberOfRotations {

    public static int countRotations(int arr[])
    {
        int count = 0 ;
        int min= arr[arr.length-1];
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]>min)
            {
                count++;
            }
        }

        return count ;
    }

    public static void main(String args[])
    {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int i = countRotations(arr);
        System.out.println("Total Rotations is ="+i);
    }
}
