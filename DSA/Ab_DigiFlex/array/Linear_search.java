package Ab_DigiFlex.array;

public class Linear_search {


    public static int linearSearch(int arr[], int search)
    {
        for(int i= 0 ;i<arr.length;i++){
            if(arr[i]==search)
            {
                return i;
            }

        }
        return  -1 ;
    }

    public static void main(String[] args) {

        int []arr={1,2,3,5,6,8,94,3,5,3};
        int search = 94 ;

        int i = linearSearch(arr, search);

        if(i==-1)
        {
            System.out.println("Element Not found In array");
        }
        else{
            System.out.println("Element fount At Index Position "+ i);
        }



    }
}
