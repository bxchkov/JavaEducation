package lr3;

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели (с маленькой буквы):");
        String day = in.nextLine();
        switch (day) {
            case "понедельник" -> System.out.println(day + " -  1-ый день недели");
            case "вторник" -> System.out.println(day + " - 2-ой день недели");
            case "среда" -> System.out.println(day + " - 3-ий день недели");
            case "четверг" -> System.out.println(day + " - 4-ый день недели");
            case "пятница" -> System.out.println(day + " - 5-ый день недели");
            case "суббота" -> System.out.println(day + " - 6-ой день недели");
            case "воскресение" -> System.out.println(day + " - 7-ой день недели");
            default -> System.out.println("Это не день недели");
        }
    }
}
