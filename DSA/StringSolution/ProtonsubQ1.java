package StringSolution;

public class ProtonsubQ1 {

    public static boolean checkPrime(int n )
    {

        if(n== 0)
        {
            return  true ;
        }
        if(n==1)
        {
            return  false;
        }

        for(int i = 2 ;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return  true;
    }


    public static void main(String[] args) {


        int arr[] = {4,6,7,8,10,13,16,17} ;

        int sum = 0 ;

        for(int i =0 ; i < arr.length;i++)
        {
            if(checkPrime(i) && arr[i]%2==0)
            {
                sum = sum+arr[i];
            }
        }

        System.out.println(sum);

    }
}
