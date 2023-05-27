package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите кол-во чисел для сложения:");
            int k = sc.nextInt();

            byte[] arr = new byte[k];
            byte sum = 0;

            try {
                for (byte i = 0; i < k; i++) {
                    System.out.println("Введите число для сложения:");
                    arr[i] = sc.nextByte();
                    sum += arr[i];
                }
            } catch (InputMismatchException ex) {
                System.err.println("Введенное число должно быть целое и в диапазоне от -128...127");
            }
            System.out.println("Сумма введенных чисел равна: " + sum);
        } catch (InputMismatchException e) {
            System.err.println("Необходимо ввести целое число");
        } catch (NegativeArraySizeException e) {
            System.err.println("Кол-во цифр не может быть отрицательным");
        }
    }

}
