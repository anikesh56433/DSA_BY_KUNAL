package Array50;

public class CountOccurrences {

    public static void main(String[] args) {

        int arr[]  = {1,2,3,2,3,4,3,2,3,2,4} ;

        int n = 2 ;

        int count = 0 ;

        for(int i = 0 ; i <arr.length; i++)
        {
            if(arr[i] == n)
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
