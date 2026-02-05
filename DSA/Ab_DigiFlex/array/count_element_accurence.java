package Ab_DigiFlex.array;

public class count_element_accurence {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6,8,9,4,2,14,4,90,4,1,1,3,6,9,4,4} ;
        int element = 4 ;
        int count = 0 ;


        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                 count ++ ;
            }

        }

        System.out.println("The Accurence of tha element is :" + count);

    }
}
