package core_java;

class ATM extends Thread {
    public void run() {
        System.out.println("Serving customer at ATM: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();

        atm1.start();
        atm2.start();
    }
}
