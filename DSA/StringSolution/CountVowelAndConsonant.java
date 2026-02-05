package StringSolution;

//Count Vowels and Consonants

public class CountVowelAndConsonant {

    public  static void countVowelConsonant(String str)
    {

        int vowel= 0 ;
        int consonant= 0 ;
        int space= 0;

        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U')
            {
                vowel++;
            }
            else if(str.charAt(i)==' ')
            {
                space++;
            }
            else {
                consonant++;
            }
        }

        System.out.println("vowel = "+ vowel);
        System.out.println("Consonant ="+consonant);
        System.out.println("Space =" + space);

    }

    public static void main(String[] args) {

        String str= "Hii My Name is Anikesh";
        countVowelConsonant(str);

    }

}
