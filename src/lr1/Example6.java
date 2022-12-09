package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your last name: ");
        String lastName = in.nextLine();

        System.out.println("Input your first name: ");
        String firstName = in.nextLine();

        System.out.println("Input your patronymic: ");
        String patronymic = in.nextLine();

        System.out.println("Hello, " + lastName + ", " + firstName + ", " + patronymic);
        in.close();
    }
}

