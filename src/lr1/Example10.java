package lr1;

import java.time.YearMonth;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = YearMonth.now().getYear();

        System.out.println("Input your birth year: ");
        int birthYear = in.nextInt();

        System.out.println("Your age is about " + (year - birthYear -1) + "-" + (year - birthYear) + " years old");
        in.close();
    }
}