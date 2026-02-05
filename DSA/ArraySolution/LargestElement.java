package ArraySolution;

//Find the Largest Element in Array

public class LargestElement {

    public static void main(String[] args) {

        int arr[]={2,1,3,5,7,3,9,1,3};

        int temp = arr[0];

        for(int i= 1 ;i<arr.length;i++)
        {
            if(arr[i]>temp)
            {
                temp = arr[i];
            }
        }

        System.out.println("Biggest Element In array is ="+ temp);

    }
}
