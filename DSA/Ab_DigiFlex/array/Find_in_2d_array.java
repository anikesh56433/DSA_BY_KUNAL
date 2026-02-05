package Ab_DigiFlex.array;

public class Find_in_2d_array {

    public static void main(String[] args) {

        int arr[][] = {
              {1,2,3,4},
              {5,6,7,8},
              {8,9,4},
                {2,1}
        };

        int search  = 4;


        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0 ;j<arr[i].length;j++)
            {
                if(arr[i][j]==search){
                    System.out.println("Element found at Index"+ (i+" "+j));

                }
            }
        }


    }
}
