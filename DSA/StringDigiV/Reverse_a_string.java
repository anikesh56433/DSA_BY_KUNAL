package StringDigiV;

public class Reverse_a_string {

    public static void main(String[] args) {

        String name = "Anikesh sharma" ;

        String temp = "" ;
        System.out.println(name);

        for(int  i = name.length()-1 ; i>=0;i--)
        {
            temp = temp + name.charAt(i);
        }
        System.out.println(temp);



    }

}
