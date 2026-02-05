package Array;

public class FindIn2dArray {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                   return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int target = 11;
        System.out.println(searchMatrix(arr,target));

    }
}




