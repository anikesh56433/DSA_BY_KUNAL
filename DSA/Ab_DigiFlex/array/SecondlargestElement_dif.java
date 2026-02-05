package Ab_DigiFlex.array;

public class SecondlargestElement_dif {


    public static void main(String[] args) {


        int arr[] = {13,2,5,4,8,6,9};

        int firstlargest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > firstlargest) {
                secondLargest = firstlargest;
                firstlargest = arr[i];
            }

            if (arr[i]>secondLargest & arr[i]<firstlargest)
            {
                secondLargest = arr[i] ;
            }
        }

        System.out.println(secondLargest);
    }


}



