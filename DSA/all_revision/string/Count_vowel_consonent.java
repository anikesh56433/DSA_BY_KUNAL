package all_revision.string;

public class Count_vowel_consonent {

    public static void main(String args[])
    {

        String s = "POoja PawAr";

        int v_count = 0 ;
        int c_count= 0 ;
        int s_count = 0 ;


        for(int i = 0 ; i<s.length();i++)
        {

            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'|| s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'  ){
                v_count++;
            }

            else if(s.charAt(i)==' '){
                s_count++;
            }
            else{
                c_count++;
            }
        }

        System.out.println("vowel = "+ v_count);
        System.out.println("Consonent = "+ c_count);
        System.out.println("Space = "+ s_count);


    }

}
