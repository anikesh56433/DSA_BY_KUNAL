package Practice_Riv;

public class PrintEvenOnPrimeIndexes {

    public  static boolean checkPrime(int n )
    {

        if(n<=1)
        {
            return  false;
        }

        if(n==2)
        {
            return true;
        }

        for(int i = 2 ; i<=(n/2);i++)
        {
            if(n%i==0 )
            {
                return false;
            }
        }

        return  true;

    }



    public static void printNumber(int arr[])
    {

        for(int i = 0 ; i< arr.length;i++)
        {
            if(checkPrime(i) && arr[i]%2==0)
            {
                System.out.println(arr[i]+" "+"with Index "+i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,22,3,4,4,6,8,3,4,5,6,8,8,7,64,2,5,3,5,7,89,11,12,22};
         printNumber(arr);


    }
}
