package timus.any20;

import java.util.Scanner;

public class task1639 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b;
        System.out.println("Длина шоколадки");
        a = in.nextInt();
        System.out.println("Ширина шоколадки");
        b = in.nextInt();
        in.close();
        int r = (a * b) % 2;
        String result;
        if (r == 0) result = "[:=[first]";
        else result = "[second]=:]";
        System.out.println(result);
    }
}
