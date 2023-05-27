package timus.any20;

import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        if ((12 - a) * 45 <= 240) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

