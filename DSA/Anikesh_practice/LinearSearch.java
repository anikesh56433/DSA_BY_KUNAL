package Anikesh_practice;

public class LinearSearch {

    public static void main(String[] args) {


        int arr[] = {5,2,1,11,3,22,223,44,55};
        int search = 23;
        boolean f=false;

        for(int i: arr)
        {
            if(i==search)
            {
                f=true;
                System.out.println("Data Found");
                break;
            }
        }
        if(!f)
        {
            System.out.println("Data Not Found");
        }

    }
}
