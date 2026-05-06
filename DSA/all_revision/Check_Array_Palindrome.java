package all_revision;

public class Check_Array_Palindrome {

   public static void main(String args[]){

       int arr[]= {1,2,3,2,1};
       boolean f= true;

       for(int i = 0,j=arr.length-1 ; i<j;i++,j--)
       {
           if(arr[i]!=arr[j])
           {
            f= false ;
            break;
           }
       }

       if(f)
       {
           System.out.println("Arrays is palindrome") ;
       }
       else{
           System.out.println("Array is not palindrome");
       }
   }

}
