package Anikesh_practice;

public class check_array_isShorted {

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,8};
        boolean f=false;
        for(int i=1; i < arr.length;i++)
        {
            if(arr[i-1]>arr[i]){
                f=true;
                System.out.println("Array Is  Shorted ");
                break;
            }
        }
        if(!f)
        {
            System.out.println("Array is shorted ");
        }
    }
}
