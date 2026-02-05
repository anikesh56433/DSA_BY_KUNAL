package Ab_DigiFlex.array;

public class Find_numbers_with_even_number_of_digits {



    public static void main(String[] args) {

        int arr[] = {12,1,2,4,5,6,5,3,55,0,8,7};

        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+ "  ");
            }
        }


    }
}
