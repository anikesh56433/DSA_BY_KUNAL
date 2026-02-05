package ArraySolution;

//Find the Missing Number (1 to n)

public class FindMissingNumberOneToN {

    public  static int missingNum(int arr[]) {
        int sum = 0;
        int n = arr.length + 1;
        int allSum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return allSum - sum;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,8,10};
        int i = missingNum(arr);

        System.out.println(i);


    }
}
