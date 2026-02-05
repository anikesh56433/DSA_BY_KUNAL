package core_java;

public class Multithreading1 extends  Thread{

    @Override
    public void run() {
        System.out.println("Thread is running "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {


        Thread t = new Multithreading1();

        t.start();

    }


}
