package lr1;

import java.time.YearMonth;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = YearMonth.now().getYear();

        System.out.println("Input your firstName: ");
        String name = in.nextLine();

        System.out.println("Input your birth year: ");
        int birthYear = in.nextInt();

        System.out.println(name + ", " + (year - birthYear) + " yo");
        in.close();
    }
}