package StringSolution;

public class ReplaceCharacterInString {

    public static void main(String[] args) {
        // Using method
        String str= "banana";
        char oldCh = 'a';
        char newCh = 'o';
        String replace = str.replace(oldCh, newCh);
        System.out.println(replace);

        // Using Loops
        String ans= "";

        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i)==oldCh)
            {
                ans+=newCh;
            }
            else{
                ans+=str.charAt(i);
            }
        }

        System.out.println(ans);

    }
}
