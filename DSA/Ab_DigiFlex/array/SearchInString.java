package Ab_DigiFlex.array;

public class SearchInString {

     public static  int findInString(String s , char ch){

         for(int i = 0 ; i <s.length();i++)
         {
             if(s.charAt(i)=='m'){

                 return  i ;

             }
         }
         return  -1 ;
     }

    public static void main(String[] args) {

        String s = "Anikesh Sharma" ;
        char ch = 'm' ;

        int inString = findInString(s, ch);

        if(inString!=-1)
        {
            System.out.println("data fount at index "+ inString);
        }
        else {
            System.out.println("data not fount In String ");
        }


    }
}
