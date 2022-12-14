package lr3;

import java.util.Objects;
import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = in.nextLine();
        if (Objects.equals(day, "Понедельник") || Objects.equals(day, "понедельник")) {
            System.out.println(day + " - 1-ый день недели");
        }
        else if (Objects.equals(day, "Вторник") || Objects.equals(day, "вторник")) {
            System.out.println(day + " - 2-ой день недели");
        }
        else if (Objects.equals(day, "Среда") || Objects.equals(day, "среда")) {
            System.out.println(day + " - 3-ий день недели");
        }
        else if (Objects.equals(day, "Четверг") || Objects.equals(day, "четверг")) {
            System.out.println(day + " - 4-ый день недели");
        }
        else if (Objects.equals(day, "Пятница") || Objects.equals(day, "пятница")) {
            System.out.println(day + " - 5-ый день недели");
        }
        else if (Objects.equals(day, "Суббота") || Objects.equals(day, "суббота")) {
            System.out.println(day + " - 6-ой день недели");
        }
        else if (Objects.equals(day, "Воскресение") || Objects.equals(day, "воскресение")) {
            System.out.println(day + " - 7-ой день недели");
        }
        else {
            System.out.println("Это не день недели");
        }
    }
}
