package lr11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для преобразования");
        int number = sc.nextInt();
        String result = toBinarySystem(number);
        System.out.println("Ваше число в двоичной системе исчисления: " + result);
    }

    public static String toBinarySystem(int number) {
        if (number == 1)  return "1";
        else if (number == 0)  return "0";
        else {
            int a = number / 2;
            int b = number % 2;
            return toBinarySystem(a) + b;
        }
    }
}