package all_revision.string;

public class Total_words {

    public static void main(String args[])
    {

        String s =  "hello my name is anikesh sharma from indore aa";
        String desc = s.trim();
        int wordCount= 0 ;

        for(int i = 0 ; i<desc.length(); i++)
        {
            if(desc.charAt(i)==' '){
                wordCount++;
            }
        }
        wordCount+=1;
        System.out.println("Total words in String :"+wordCount);

    }
}
