package Ab_DigiFlex.array;

public class MissingNumberInShortedArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,9} ;
        int sum = 0 ;

        for(int i =0 ;i< arr.length;i++){
            sum =sum +arr[i] ;
        }
        int n = arr[arr.length-1] ;

        int totalSum   =  (n  * (n+1))/2 ;

        int missingNum = totalSum - sum ;

        System.out.println(missingNum);




    }
}
