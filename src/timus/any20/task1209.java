package timus.any20;

import java.util.Scanner;

public class task1209 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        for (long i = 0; i < n; i++) {
            long a = in.nextLong() - 1;
            long b = (long) Math.sqrt(8 * a + 1);

            if (b * b == (8 * a + 1))
                System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
