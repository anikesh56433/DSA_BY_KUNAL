package recursion;

public class FibonacchiNumber {

    public static  int fiboNumber(int n )
    {
        if(n<2)
        {
            return n ;
        }

        return  fiboNumber(n-1)+ fiboNumber(n-2);
    }

    public static void main(String[] args) {


        int i = fiboNumber(4);
        System.out.println(i);

    }
}
