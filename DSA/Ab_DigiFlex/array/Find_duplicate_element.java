package Ab_DigiFlex.array;

public class Find_duplicate_element {

    public static void main(String args[])
    {

        int arr[]= {1,2,3,3,4,5,5};
        int duplicate=-1;

        for(int i =1 ;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i]){

                duplicate=arr[i];
//                For first duplicate use break and for last duplicate not use break statement
            }
        }

        System.out.println(duplicate);

    }
}
