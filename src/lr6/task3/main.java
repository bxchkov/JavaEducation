package lr6.task3;

import java.util.Arrays;

import static lr6.task3.task3.*;

public class main {
    public static void main(String[] args) {
        task3.Method1();
        System.out.println("Максимальный член массива " + Max);
        System.out.println("Минимальный член массива " + Min); // вывод полученных данных
        System.out.println("Среднеарифметическое членов массива " + Average);
        System.out.println("Обрабатываемый массив: " + Arrays.toString(Array));
    }
}