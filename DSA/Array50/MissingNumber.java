package Array50;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[]= {1,2,4,5,6,7,8};
        int n= arr.length+1;

        int totalSum  = (n * (n+1))/2;
        int sum = 0 ;
        for(int i =0 ;i< arr.length ; i++)
        {
            sum = sum+arr[i];
        }

        int missingNum = totalSum-sum ;

        System.out.println(missingNum);

    }
}
