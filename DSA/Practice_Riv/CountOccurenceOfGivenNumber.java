package Practice_Riv;

public class CountOccurenceOfGivenNumber {

    public static void main(String[] args) {

        int arr[] =  {1,2,3,3,4,2,4};
        int n = 4;
        int count = 0   ;

        for(int i = 0  ; i < arr.length ; i++)
        {
            if(arr[i]== n)
            {
                count++ ;

            }
        }
        System.out.println(count);
    }

}
