package Practice_Riv;

public class Check2ArrayAreEqualOrNot {

    public static void main(String[] args) {
        int arr1[]  = {1,2,3,4,5,6} ;
        int arr2[]  = {1,2,3,4,5,6} ;

        boolean f= true ;

        if(arr1.length!=arr2.length)
        {
            f =false;
        }
        else {
            for(int i = 0 ; i<arr1.length;i++)
            {
                  if(arr1[i]!=arr2[i])
                  {
                      f=false;
                      break;
                  }
            }
        }

        if(f)
        {
            System.out.println("Both are Same");
        }
        else {
            System.out.println("Both are Not Same ");
        }
    }

}
