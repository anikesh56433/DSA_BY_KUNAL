package Ab_DigiFlex.array;

public class check_2Array_are_equals {

    public  static  boolean checkArray(int arr1[], int arr2[])
    {

        if(arr1.length!=arr2.length)
        {
            return  false  ;
        }

        for(int i = 0 ;  i<arr1.length;i++){

            if(arr1[i]!=arr2[i]){
                return  false;
            }
        }
        return  true;
    }



    public static void main(String args[])
    {
        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {1,2,3,4,5,6,7,8} ;

        boolean b = checkArray(arr1, arr2);

        if(b){
            System.out.println("Both array  are same");
        }
        else {
            System.out.println("Array are not same");
        }


    }
}
