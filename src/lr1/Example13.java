package lr1;

import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calculating the sum of 2 numbers");

        System.out.println("Input first number: ");
        int firstNum = in.nextInt();

        System.out.println("Input second number: ");
        int secondNum = in.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        in.close();
    }
}