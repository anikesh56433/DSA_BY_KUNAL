package core_java;


import java.util.Scanner;

public class Exception_Handling {

     // Normal Exception Handling
//     public static void main(String[] args) {
//         int a = 10 ;
//         int b=0;
//         try {
//             int c= a/b;
//             System.out.println(c);
//         }
//         catch (ArithmeticException e)
//         {
//             System.out.println(e);
//         }
//         catch (ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println(e);
//         }
//         catch (Exception e)
//         {
//             System.out.println(e);
//         }
//
//         finally {
//             System.out.println("Program completed");
//         }

   //  }

//
//    public static void run()  throws  ArithmeticException
//    {
//        int arr[]= {1,2,3,5,6};
//        System.out.println(arr[5]);
//
//    }
//
//    public static void main(String[] args)  throws ArrayIndexOutOfBoundsException
//    {
//
//
//        System.out.println("Anikesh");
//
//        try {
//            run();
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
//
//        System.out.println("Done");
//
//
//    }


    // Costume Exception


    public static void checkAge(int age) throws AnikeshException
    {
        if(age <18 || age >100)
        {
            throw  new AnikeshException("age Is Invalid For Driving car");
        }
        else {
            System.out.println("Age is Accepted");
        }
    }

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int age = sc.nextByte();

        try {
            checkAge(age);
        }
        catch (AnikeshException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("vote completed");
        }

    }


}
