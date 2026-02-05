package ArraySolution;

public class CountAccurenceOfNumber {

    public static int countAOfNumber(int arr[], int  n )
    {
        int count  = 0 ;

        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,3,3,4,5,6,73,3,3,3,3,3,3,3};

        int n= 3  ;

        int i = countAOfNumber(arr, n);

        System.out.println(i);


    }
}
