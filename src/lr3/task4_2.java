package lr3;

import java.util.Scanner;

public class task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        boolean isInt1 = false;
        while (!isInt1){
            String line1 = in.next();
            try {
                int num1 = Integer.parseInt(line1);
                isInt1 = true;
                System.out.println("Введите второе целое число, которое больше первого:");
                int num2 = num1;
                while (num2 <= num1){
                    String line2 = in.next();
                    try {
                        num2 = Integer.parseInt(line2);
                        if (num2 <= num1){
                            System.out.println("Второе целое число должно быть больше первого(" + num1 + "):");
                        } else {
                            System.out.println("Перечисляю числа с " + num1 + " по " + num2 + ":");
                            int i = num1;
                            while (i <= num2){
                                System.out.println(i);
                                i++;
                            }
                        }
                    }
                    catch (NumberFormatException exception){
                        System.out.println("Это не целое число, попробуйте снова:");
                    }
                }
            }
            catch (NumberFormatException exception){
                System.out.println("Это не целое число, попробуйте снова:");
            }
        }
    }
}
