package StringSolution;
// Reverse a String

public class ReverseString {

    public  static String reverseString(String str)
    {

        String reverseString = "";

        for(int i = str.length()-1 ; i>=0 ;i--)
        {
            reverseString = reverseString+ str.charAt(i);
        }


    return   reverseString;
    }

    public static void main(String[] args) {

        String str= "Anikesh Sharma";

        String s = reverseString(str);

        System.out.println(s);

    }

}
