package lr3;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в диапозоне от 1 до 7 включительно:");
        boolean isInt = false;
        while (!isInt){
            String line = in.next();
            try {
                int num = Integer.parseInt(line);
                isInt = true;
                switch (num) {
                    case 1 -> System.out.println(num + "-ый день недели - понедельник");
                    case 2 -> System.out.println(num + "-ой день недели - вторник");
                    case 3 -> System.out.println(num + "-ий день недели - среда");
                    case 4 -> System.out.println(num + "-ый день недели - четверг");
                    case 5 -> System.out.println(num + "-ый день недели - пятница");
                    case 6 -> System.out.println(num + "-ой день недели - суббота");
                    case 7 -> System.out.println(num + "-ой день недели - воскресение");
                    default -> System.out.println("Это число выходит за рамки диапозона");
                }
            }
            catch (NumberFormatException exception){
                System.out.println("Это не число, попробуйте снова:");
            }
        }
    }
}
