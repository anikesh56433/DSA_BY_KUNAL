package all_revision;

import java.util.Arrays;

public class Move_All_Zeros_To_end {

    public static void main (String args[])
    {

        int arr[] = {1,0,3,4,0,50,0,6,8,0,3,0};

        int arr2[] = new int [arr.length] ;

        int index = 0 ;

        for(int i = 0 ; i <arr.length ; i++)
        {
            if(arr[i]>0)
            {
                arr2[index++] = arr[i] ;
            }
        }
        for(int i = index ; i <arr.length ; i ++)
        {
            arr[i]  = 0 ;
        }

        System.out.println(Arrays.toString(arr2)) ;








    }
}
