package all_revision.string;

public class Charecter_Sorting {

    public static void main(String args[])
    {
        String name = "Anikesh sharma";
        String result = sort(name);
        System.out.println(result);

        char duplicate = duplicate(result);

        if (duplicate == '1')
         {
            System.out.println("No duplicate Charecter found ");
        }
        else{
            System.out.println("Duplicate char is " + duplicate);
        }


    }

    public static char duplicate(String s){

        for(int i = 1 ; i<s.length() ; i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                return s.charAt(i);
            }
        }
        return '1';
    }






    public static String sort(String name)
    {
        char  sorted[] = name.toCharArray();

        for(int i = 0 ; i<name.length() ;i++)
        {
            for(int j = i+1 ; j<name.length(); j++)
            {
                if(sorted[i]>sorted[j])
                {
                    char temp = sorted[i] ;
                    sorted[i] = sorted[j];
                    sorted[j] = temp ;
                }
            }
        }
        String result  = "";

        for(int i = 0 ; i<sorted.length; i++)
        {
            result = result+sorted[i];
        }
        return result;
    }
}
