package labassignment_1_3;

class NumberOne extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class NumberEleven extends Thread {

    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Thread_Odd_Even {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new NumberOne();
        Thread t2 = new NumberEleven();

        t1.start();
        t2.start();

    }
}
