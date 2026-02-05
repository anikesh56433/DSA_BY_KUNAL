package Ab_DigiFlex.array;

import java.security.cert.TrustAnchor;

class Chack_Array_is_shorted {


     public static  void main(String args[]){

         int arr[] = {1,2,3,4,5,33,6,7,8,9};
         boolean f= true;

         for(int i = 1 ;i<arr.length;i++)
         {
             if(arr[i-1]>arr[i]){

                 f=false;
                 break;
             }
         }

         if(f)
         {
             System.out.println("Array is shorted");
         }else {
             System.out.println("Array is Not Shorted");
         }

     }

}
