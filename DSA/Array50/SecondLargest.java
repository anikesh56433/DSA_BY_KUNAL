package Array50;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[]={2,4,3,5,7,8,42};

        int firstLar = arr[0];
        int secondlargest= 0 ;

        for(int i = 0 ; i <arr.length;i++)
        {
            if(arr[i]>firstLar)
            {
                secondlargest = firstLar;
                firstLar = arr[i];
            }

            if(arr[i]>secondlargest && arr[i]<firstLar)
            {
                secondlargest= arr[i];
            }
        }

        System.out.println(secondlargest);

    }
}
