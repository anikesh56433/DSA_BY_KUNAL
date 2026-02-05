package Array;

public class CountOfRotation {

    public static  int countRotation( int  arr[])
    {
        int min = arr[arr.length-1];
        int count = 0 ;
        for(int i = 0 ; i< arr.length;i++)
        {
            if(arr[i]>min)
            {
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {

        int arr[] = {7,8,1,2,4,5,6};
        int i = countRotation(arr);

        System.out.println(i);

    }
}
