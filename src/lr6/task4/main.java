package lr6.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Ведите число для нахождения двойного факториала: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        task4 f = new task4();
        System.out.println("Фaктopиaл " + num + " равен " + f.fact(num));
    }
}

