package StringSolution;

public class ConvertStringToUperAndLowerCase {

    public  static  String upperCase(String str)
    {

        String temp = "";

for(int i = 0 ; i<str.length();i++)
{
    char ch = str.charAt(i);
    if(ch >=97 && ch<=122)
    {
       ch = (char) (ch-32);
    }
    temp = temp+ch;

}
return  temp;

    }
    public  static  String lowerCase(String str)
    {

    String temp ="";
    for(int i = 0 ; i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(ch>=60 && ch<=90)
        {
            ch = (char)(ch+32);
        }
        temp+= ch;
    }

    return  temp;
    }

    public static void main(String[] args) {

       String name = "ANIKESH sharma";

        String s = upperCase(name);
        String s1 = lowerCase(name);

        System.out.println(s);
        System.out.println(s1);
    }
}
