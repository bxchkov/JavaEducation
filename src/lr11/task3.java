package lr11;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Введите числа");
        addArrayNumbers(array, 0, size, sc);

        System.out.println("Ваш массив: ");
        showArrayNumbers(array, 0, size);

    }

    public static void addArrayNumbers(int[] array, int i, int size, Scanner sc) {
        if (i < size) {
            array[i] = sc.nextInt();
            addArrayNumbers(array, i + 1, size, sc);
        }
    }

    public static void showArrayNumbers(int[] array, int i, int size) {
        if (i < size) {
            System.out.println(array[i]);
            showArrayNumbers(array, i + 1, size);
        }
    }
}
