package lr6.task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Ведите число для нахождения суммы квадратов слогаемых: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        task5 s = new task5();
        System.out.println("Сумма квадратов " + num + " равна " + s.sqr(num));
    }
}

