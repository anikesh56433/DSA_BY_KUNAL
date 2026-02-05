package ArraySolution;

 //Sum of Array Elements
public class SumOfArrayElement {

    public  static  int sumOfAllEle(int arr[])
    {

        int sum  = 0 ;
        for(int i=0 ; i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
      return  sum;
    }

     public static void main(String[] args) {
          int arr[] = {1,2,3};

         int i = sumOfAllEle(arr);

         System.out.println(i);


     }
}
