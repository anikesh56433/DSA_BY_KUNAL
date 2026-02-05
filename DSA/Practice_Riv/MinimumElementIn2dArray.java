package Practice_Riv;

public class MinimumElementIn2dArray {

    public static void main(String[] args) {

        int arr[][] = {
                {12,2,3,4},
                {6,7,8,9},
                {9,7,1,4,10},
        };

        int minimum = Integer.MAX_VALUE;

        for(int i =0 ; i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(minimum>arr[i][j])
                {
                    minimum = arr[i][j] ;
                }
            }
        }

        System.out.println("MiniMum Data In 2D array Is "+minimum);

    }
}
