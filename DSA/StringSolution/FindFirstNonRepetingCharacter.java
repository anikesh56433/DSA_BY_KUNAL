package StringSolution;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepetingCharacter {

    public static void main(String[] args) {

        String s= "aabbvccddeffg";

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch , map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        String s1="";
        for(char ch: map.keySet())
        {
           if(map.get(ch)==1)
           {
              s1+=ch;
           }
        }
        System.out.println(s1.charAt(0));

    }

}
