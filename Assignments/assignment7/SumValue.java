package assignment7;

import java.util.Random;

public class SumValue {
    static void generateRandomArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
    }

    static long sum(int[] arr) throws InterruptedException {
        long sum = 0;
        AddThread t1 = new AddThread(0, arr);
        AddThread t2 = new AddThread(1000000, arr);
        AddThread t3 = new AddThread(2000000, arr);
        AddThread t4 = new AddThread(3000000, arr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        sum += t1.getSum();
        sum += t2.getSum();
        sum += t3.getSum();
        sum += t4.getSum();
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

    static class AddThread extends Thread {
        private int start;
        private long sum;
        private int[] arr;

        AddThread(int start, int[] arr) {
            this.start = start;
            this.sum = 0;
            this.arr = arr;
        }

        @Override
        public void run() {
            int end = start + 1000000;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
        }

        public long getSum() {
            return this.sum;
        }
    }
}
