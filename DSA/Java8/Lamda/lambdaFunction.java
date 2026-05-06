package Java8.Lamda;



public class lambdaFunction  {


    public static void main(String args[]){

        FunctionalInter f= new FunctionalInter() {
            @Override
            public void run() {
                System.out.println("Hello Anieksh this side ");
            }
        };

        f.run();


        Runnable r = () -> System.out.println("Hello");

    }

}
