package all_revision.string;

public class Remove_Space_From_String {

    public static void main(String args[])
    {
        String s = " Anikesh Sharma  ";

        // with out loop

        String name = s.replace("a" ," ");
        System.out.println(name);


        // With Loop

       String full_name = "";

       for(int i = 0 ;i<s.length();i++) {
           if (s.charAt(i) != ' '){

               full_name = full_name+s.charAt(i);
           }
       }
       System.out.println(full_name);
    }
}
