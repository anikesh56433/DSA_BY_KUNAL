package Ab_DigiFlex.array;

public class largestPalindromNumber {

    public static  boolean isPalindromeNumber(int num)
    {
        int sum = 0 ;
        int temp = num ;
        while(num!=0)
        {
            int r= num%10 ;
            sum = sum *10+r ;
            num =num/10;
        }
        if(sum==temp)
        {
            return  true;
        }
        return false;

    }

    public static void main(String[] args) {

        int arr[] = {11,22,33,121,12321,12343,53,555,777} ;

        int max_palindrome = -1 ;
        int index = -1 ;

        for(int i = 0 ;i < arr.length ; i++){

             if (isPalindromeNumber(arr[i]))
             {
                 if(arr[i]>max_palindrome){
                     max_palindrome = arr[i] ;
                     index = i ;
                 }
             }
        }


        if(index== -1 )
        {
            System.out.println("There is no plaindrome Number In Array : ");
        }
        else{
            System.out.println("Max Palindrom Number is :" + max_palindrome);
        }





    }
}
