package lr13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static int result = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество элементов массива: ");
        int in = scanner.nextInt();
        int[] arr = new int[in];

        Random random = new Random();
        for (int i = 0; i < in; i++) {
            arr[i] = random.nextInt(1000000);
        }

        System.out.println(Arrays.toString(arr));

        max(arr, in);

    }

    public static void max(int[] arr, int in) throws InterruptedException {
        int currentSC1 = in / 3;
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < currentSC1; i++)
                if (result < arr[i])
                    result = arr[i];
        });

        Thread thread2 = new Thread(() -> {
            for (int i = currentSC1; i > 0; i--)
                if (result < arr[i])
                    result = arr[i];
        });

        Thread thread3 = new Thread(() -> {
            for (int i = currentSC1; i < currentSC1 * 2; i++)
                if (result < arr[i])
                    result = arr[i];
        });

        Thread thread4 = new Thread(() -> {
            for (int i = currentSC1 * 2; i > currentSC1; i--)
                if (result < arr[i])
                    result = arr[i];
        });

        Thread thread5 = new Thread(() -> {
            for (int i = currentSC1 * 2; i < in; i++)
                if (result < arr[i])
                    result = arr[i];
        });

        Thread thread6 = new Thread(() -> {
            for (int i = in - 1; i > currentSC1 * 2; i--)
                if (result < arr[i])
                    result = arr[i];
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread6.join();

        System.out.println(result);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.println("Наиб. элемент из массива: " + max);

    }
}