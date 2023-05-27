package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }

        System.out.println("Массив 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив 2: ");
        System.out.println(Arrays.toString(arr2));

        findCommonElements(arr1, arr2);

    }

    public static void findCommonElements(int[] arr1, int[] arr2) {
        int[] arr = Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x)).toArray();
        if (arr.length == 0)
            System.out.println("Не нашлось одинаковых элементов");
        else
            System.out.println("Массив после объединения: " + Arrays.toString(arr));
    }
}