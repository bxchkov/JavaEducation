package timus.any20;

import java.util.Scanner;

public class task2023 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int mail = 0;
        int steps = 0;

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int b = getBox(s);
            steps += (Math.abs(mail - b));
            mail = b;
        }
        System.out.println(steps);
    }

    static int getBox(String a) {
        if (a.startsWith("A") || a.startsWith("P") || a.startsWith("O") || a.startsWith("R"))
            return 0;
        else if (a.startsWith("B") || a.startsWith("M") || a.startsWith("S"))
            return 1;
        else
            return 2;
    }
}
