package Practice_Riv;

public class SearchInString {


    public static void main(String[] args) {

        String s = "Anikesh sharma ";
        char ch = 'h';

        int charInString = findCharInString(s, ch);

        System.out.println("Data Fount At Index :"+charInString);


    }

    public static int findCharInString(String s, char ch)
    {

        for(int  i = 0 ; i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {

                return  i ;

            }
        }
        return -1 ; 
        
    }
    
    
}
