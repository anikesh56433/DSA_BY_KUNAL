package Java8.Lamda.practice;

public class WithThread {

    public static void main(String[] args) {

        Runnable run = () ->{

            System.out.println("hello i am Running in run method ");

            for(int i = 1 ; i<=20 ;i++)
            {
                System.out.println(i +" Hello ");
                try{
                    Thread.sleep(2000);
                }
                catch (Exception e ){
                    System.out.println(e) ;
                }

            }
        };

        Thread t1 = new Thread(run );
        t1.start();

    }
}

