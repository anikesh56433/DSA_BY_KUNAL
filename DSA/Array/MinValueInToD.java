package Array;

public class MinValueInToD {


    public static int minValue(int arr[][])
    {
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]<min)
                {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {


        int arr[][]={
            {7,596,34,6},
            {2,3,5,7,966},
            {2,2,4,5,8,7},
            {86,5,4}
        };


       int minimul_Value  =   minValue(arr);

       System.out.println(minimul_Value);
        
    }





    
}
