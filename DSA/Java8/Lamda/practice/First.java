package Java8.Lamda.practice;

public class First  {





    public static void main(String[] args) {

        FirstInter f1 =(a,b)->
        {
            System.out.println("Hello Run Your are Running ......");
          System.out.println("The Sum Of Both the numbers is : "+(a+b));
        };


        f1.run(2,4);

    }
}
