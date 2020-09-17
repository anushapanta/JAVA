package labassignment_1_3;

class One_To_Ten extends Thread {

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

class Eleven_Twenty extends Thread {

    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Twentyone_Thirty extends Thread {

    @Override
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

/**
 *
 * @author user
 */
public class Threading_PriorityBase {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new One_To_Ten();
        Thread t2 = new Eleven_Twenty();
        Thread t3 = new Twentyone_Thirty();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
}
