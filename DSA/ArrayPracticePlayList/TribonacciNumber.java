package ArrayPracticePlayList;

public class TribonacciNumber {

    public static int tibonacchiS(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(n==2)
        {
            return 1;
        }

        int fn=0;
        int sn=1;
        int tn= 1;

        for(int i=1;i<=n;i++)
        {
            int fon= fn+sn+tn;

            fn=sn;
            sn=tn;
            tn=fon;


        }

        return fn;
    }

    public static void main(String[] args) {

        int n=25;
        int i = tibonacchiS(n);

        System.out.println(i);


    }
}
