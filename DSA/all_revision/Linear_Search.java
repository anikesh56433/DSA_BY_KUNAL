package all_revision;

public class Linear_Search {

    public static void main(String args[])
    {

        int arr[]= {1,3,5,6,8,4,9,22};

        int n  =2 ;
        boolean f = false ;
        int i;

        for(i = 0 ;i<arr.length;i++)
        {
            if(arr[i]==n)
            {

                f= true;
                break;
            }
        }

        if(f){
            System.out.println(n+"  found At Index "+ i );
        }
        else{
            System.out.println("Element not found");
        }


    }

}
