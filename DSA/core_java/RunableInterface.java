package core_java;

class TicketBooking implements Runnable {
    public void run() {
        System.out.println("Booking ticket by: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new TicketBooking());
        Thread t2 = new Thread(new TicketBooking());

        t1.start();
        t2.start();
    }
}

