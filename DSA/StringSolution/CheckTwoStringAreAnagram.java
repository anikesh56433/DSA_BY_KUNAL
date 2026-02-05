package StringSolution;

import java.util.Arrays;

public class CheckTwoStringAreAnagram {

    public static void main(String[] args) {

        String s1 ="army aca";
        String s2 ="mary aca";

        boolean f=true;

        String str = s1.replaceAll(" ", "");
        String str1 = s2.replaceAll(" ", "");

        if(str1.length()!=str.length())
        {
            f= false;
        }


        char[] charArray = str.toCharArray();
        char[] charArray1 = str1.toCharArray();



        Arrays.sort(charArray);
        Arrays.sort(charArray1);


     f  = Arrays.equals(charArray,charArray1);

        if(f)
        {
            System.out.println("String are anagram");
        }
        else {
            System.out.println("String are not anagram");
        }


    }
}
