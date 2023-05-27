package timus.any20;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите 2 числа — кол-во банок, " +
                "простреленных Гарри и Ларри соответственно");
        int a = in.nextInt();
        int b = in.nextInt();

        int bank = a + b - 1;

        int H = bank - a;
        int L = bank - b;

        System.out.println("Кол-во банок, не простреленных " +
                "Гарри и Ларри соответственно: " + H + "  " + L);
        out.flush();
    }
}
