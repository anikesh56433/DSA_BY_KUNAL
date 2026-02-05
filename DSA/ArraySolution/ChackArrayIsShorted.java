package ArraySolution;

public class ChackArrayIsShorted {

    public  static boolean checkArrayIsShortedOrNot(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return  true;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,3,4,5,6,7,7};

        boolean b = checkArrayIsShortedOrNot(arr);

        if(b)
        {
            System.out.println("Array is Shorted");
        }
        else{
            System.out.println("Array is Not shorted");
        }


    }
}
