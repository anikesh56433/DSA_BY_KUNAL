package ArraySolution;

//Check for Palindromic Array

public class CheckArrayIsPalindromicOrNor {

    public static  boolean checkArrayIsPalindromicOrNot(int arr[])
    {
        int temp [] = new int[arr.length];
        int a=0;
        for(int i = arr.length-1;i>=0 ;i-- )
        {
            temp[a]=arr[i];
            a++;
        }

        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]!=temp[i])
            {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,1};

        boolean b = checkArrayIsPalindromicOrNot(arr);

        if(b)
        {
            System.out.println("Array is Palindromic");
        }
        else {
            System.out.println("Array is not palindromic");
        }


    }
}
