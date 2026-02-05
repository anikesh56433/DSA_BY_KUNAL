package Array;

public class Find_Numbers_with_Even_Number_of_Digits {

    public static void main(String[] args) {

        int arr[]={111,1212,12,4,6,4,7,9,3,6,89,3,56,8};

        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i] %2==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
