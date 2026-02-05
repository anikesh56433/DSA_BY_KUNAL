 package Ab_DigiFlex.array;

public class Minimum_in2D {

    public static void main(String[] args) {

        int arr[][] = {
                {12,24,36,48},
                {5,6,7,8},
                {8,9,4,8}

        };

        int min  = Integer.MAX_VALUE;


        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0 ;j<arr[i].length;j++)
            {
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimun Element In 2 d Array is :" + min);

    }
}
