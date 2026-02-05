package Ab_DigiFlex.array;

 class array_first {

     public static void main(String args[]){

         int arr[] = {1,34,5,7,8,9,0,8};

         for(int i = 0 ; i<arr.length;i++)
         {
             System.out.print(arr[i]+"  ");
         }
         System.out.println();

         for(int a: arr){
             System.out.print(a+" ");
           }

     }

}
