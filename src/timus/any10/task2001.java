package timus.any10;

import java.util.Scanner;

public class task2001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int result = b1-b2;
        int result2 = b3-result-b2;

        System.out.println(result2 + " " + result);

    }

}
