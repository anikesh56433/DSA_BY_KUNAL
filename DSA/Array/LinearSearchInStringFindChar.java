package Array;

public class LinearSearchInStringFindChar {

    public static int findChar(String str,char target)
    {
        if(str.length()==0)
        {
            return -1;
        }
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String str = "Anikesh Sharma";

        char target= 'S';

          int i =findChar(str, target);

          System.out.println(i);
        
    }
    
}
