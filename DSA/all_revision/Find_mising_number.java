package all_revision;

public class Find_mising_number {

    public static void main(String args []) {

        int arr[] = {1,2,3,4,6};

        int sum = 0 ;

        for(int i = 0 ; i<arr.length; i++)
        {
            sum = sum +arr[i] ;
        }

        int n = arr[arr.length-1] ;

        int total_sum  = (n*(n+1))/2;;

        int missingNum = total_sum- sum;

        System.out.println(missingNum);



    }
}
