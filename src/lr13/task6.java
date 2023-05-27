package lr13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) throws InterruptedException {
        arrSum a = new arrSum();
        a.run();
    }

    static class arrSum {
        public int sumThread1, sumThread2, sumThread3, sumThread4, sumThread5, sumThread6, fm = 0;
        public int[] arr;

        arrSum() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int sc = scanner.nextInt();
            int[] arr = new int[sc];
            Random random = new Random();
            for (int i = 0; i < sc; i++)
                arr[i] = random.nextInt(10);
            System.out.println(Arrays.toString(arr));
            this.arr = arr;
        }

        public void run() throws InterruptedException {
            int section = this.arr.length / 3;
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < section; i++)
                    sumThread1 += this.arr[i];
                fm += 1;
            });

            Thread thread2 = new Thread(() -> {
                for (int c = section; c < 2 * section; c++)
                    sumThread2 += this.arr[c];
                fm += 1;
            });

            Thread thread3 = new Thread(() -> {
                for (int d = 2 * section; d < 3 * section; d++)
                    sumThread3 += this.arr[d];
                fm += 1;
            });

            Thread thread4 = new Thread(() -> {
                for (int e = 3 * section; e < 4 * section; e++)
                    sumThread4 += this.arr[e];
                fm += 1;
            });

            Thread thread5 = new Thread(() -> {
                for (int f = 4 * section; f < 5 * section; f++)
                    sumThread5 += this.arr[f];
                fm += 1;
            });

            Thread thread6 = new Thread(() -> {
                for (int q = 5 * section; q < this.arr.length; q++)
                    sumThread6 += this.arr[q];
                fm += 1;
            });

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();

            Thread result = new Thread(() -> {
                while (true) {
                    if (fm == 6) {
                        System.out.println(sumThread1 + sumThread2 + sumThread3 + sumThread4 + sumThread5 + sumThread6);
                        break;
                    }
                }
            });

            while (true) {
                if (fm == 6) {
                    result.start();
                    result.join();
                    break;
                }
            }

            System.out.println("Сумма по потокам равна:");
            System.out.println(sumThread1);
            System.out.println(sumThread2);
            System.out.println(sumThread3);
            System.out.println(sumThread4);
            System.out.println(sumThread5);
            System.out.println(sumThread6);

            System.out.print("Сумма равна: ");
            int sum = 0;
            for (int i : this.arr) sum += i;
            System.out.println(sum);
        }
    }
}