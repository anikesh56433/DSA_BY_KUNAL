package all_revision.string;

public class Convert_String_Into_UpperCase_And_LowerCase {

    public static void main(String args[])
    {

        String name = "Anikesh Sharma Ji";

        String cap_name = "";
        String sml_name = "";


        for(int i = 0 ; i <name.length() ; i++)
        {
            char ch = name.charAt(i);
            if (ch >= 'a'&& ch <='z') {

                cap_name = cap_name+(char)(ch-32);
            }
            else{
                cap_name = cap_name+ch;
            }
        }
        System.out.println(cap_name);


        for(int i = 0 ; i <name.length() ; i++)
        {
            char ch = name.charAt(i);
            if (ch >= 'A'&& ch <='Z') {

                sml_name = sml_name+(char)(ch+32);
            }
            else{
                sml_name = sml_name+ch;
            }
        }
        System.out.println(sml_name);

    }

}
