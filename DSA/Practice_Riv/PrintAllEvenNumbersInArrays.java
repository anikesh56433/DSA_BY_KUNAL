package Practice_Riv;

public class PrintAllEvenNumbersInArrays {

    public static void printEvenInArrays(int array[])
    {

        for(int i = 0 ;i< array.length; i++)
        {
            if(array[i]%2==0)
            {
                System.out.print(array[i]+" ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {111,23,44,33,22,55,677,234,2346,90};

        printEvenInArrays(arr);


    }
}
