package ArraySolution;

public class TotalEvenOrOddInArray {

    public static void numberOfEvenOrOdd(int arr[])
    {

        int even=0;
        int odd=0;
        for(int i = 0 ;i< arr.length;i++)
        {
           if( arr[i]%2==0)
           {
               even++;
           }
           else {
               odd++;
           }
        }

        System.out.println("Total Even In array is ="+even);
        System.out.println("Total odd In array is ="+odd);

    }

    public static void main(String[] args) {

        int arr[]= { 1,2,3,4,5,6,7,8,9,10};

        numberOfEvenOrOdd(arr);

    }
}
