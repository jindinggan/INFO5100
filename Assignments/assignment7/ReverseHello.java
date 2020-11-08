package assignment7;

public class ReverseHello {


    static class HelloThread extends Thread {
        private static int count = 0;
        private static final String HELLO = "Hello from Thread num!";
        private static final String REVERSE_HELLO = "!mun daerhT morf olleH";

        HelloThread() {
            count++;
        }

        @Override
        public void run() {
            if (count > 50) {
                return;
            }
            if (count % 2 == 1) {
                System.out.println(HELLO + count);
            } else {
                System.out.println(REVERSE_HELLO + count);
            }
            HelloThread t = new HelloThread();
            t.start();
        }
    }

    static class Main {
       public static void main(String[] args) {
           HelloThread t1 = new HelloThread();
           t1.start();
       }
    }
}
