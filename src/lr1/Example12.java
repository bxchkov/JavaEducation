package lr1;

import java.time.YearMonth;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = YearMonth.now().getYear();

        System.out.println("Input your age: ");
        int age = in.nextInt();

        System.out.println("Your year of birth is " + (year - age));
        in.close();
    }
}