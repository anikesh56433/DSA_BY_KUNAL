package StringDigiV;

public class Palindrome_String {

    public static void main(String[] args) {

        String name  = "ramu syamu" ;
        name.toLowerCase();
        boolean isPlaindrome = true ;

        for (int i = 0 ,j = name.length()-1; i <j;i++ ,j--)
        {
            if(name.charAt(i)!=name.charAt(j)){
                isPlaindrome = false;
                break;
            }
        }

        if(isPlaindrome)
        {
            System.out.println("String is Palindrome ");
        }
        else {
            System.out.println("String is not palindrome");
        }


    }
}
