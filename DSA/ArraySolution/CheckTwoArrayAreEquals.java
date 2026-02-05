package ArraySolution;

public class CheckTwoArrayAreEquals {

  public  static  boolean checkEqual(int arr1[] , int arr2[]) {

      if(arr1.length!=arr2.length)
      {
          return false;
      }

      for(int i=0 ; i<arr1.length;i++){

          if(arr1[i]!= arr2[i])
          {
              return false;
          }
      }

      return  true;


  }

    public static void main(String[] args) {


        int arr[]={1,2,3,2,4};
        int arr1[]={1,2,3,4,4};

        boolean b = checkEqual(arr, arr1);

        if(b) {
            System.out.println("Both are same ");
        }
        else {
            System.out.println("Both are different");
        }

    }


}
