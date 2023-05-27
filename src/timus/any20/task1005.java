package timus.any20;

import java.util.Scanner;

public class task1005 {
    public static void main(String str[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во камней");
        int n = scanner.nextInt();
        int w[] = new int[n];

        System.out.println("Введите вес камней");
        for (int i = 0; i < n; i++)
            w[i] = scanner.nextInt();

        int difference = Integer.MAX_VALUE;
        for (int j = 0; j < 1 << n; j++) {

            int a = 0;
            int b = 0;
            int c = j;

            for (int i = 0; i < n; i++) {
                if ((c & 1) > 0) a += w[i];
                else b += w[i];
                c >>= 1;
            }
            difference = Math.min(difference, Math.abs(a - b));
        }

        System.out.println(difference);
    }
}
