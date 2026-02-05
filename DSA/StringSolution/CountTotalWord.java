package StringSolution;

public class CountTotalWord {
    public static void main(String[] args) {

        String str= "  Hii mer name anikesh sharma h";
       String trim = str.trim();
        System.out.println(trim);
//        String[] s = trim.split(" ");
//        System.out.println(s.length);
        int count = 0 ;
        for(int i = 0 ;i<trim.length()-1;i++)
        {
            char ch = trim.charAt(i);
            char ch2 = trim.charAt(i+1);
            if(ch==' ' && ch2!=' ')
            {
                count++;
            }
        }

        System.out.println(count+1);

    }
}
