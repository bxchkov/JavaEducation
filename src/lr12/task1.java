package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt();

        System.out.println("Массив: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);
        System.out.println("Массив после преобразования: ");
        System.out.println(Arrays.toString(arrResult));

    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}