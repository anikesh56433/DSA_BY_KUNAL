package all_revision.string;

public class String_palindrome {

    public static void main(String args[])
    {
        String s = "naman";
        boolean f = true ;

        for(int i = 0 , j = s.length()-1 ; i<j ;i++,j--)
        {
            if(s.charAt(i)!= s.charAt(j))
            {
             f= false ;
             break ;
            }
        }

        if(f)
        {
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

}
