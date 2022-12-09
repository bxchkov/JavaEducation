package lr1;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your first name: ");
        String firstName = in.nextLine();

        System.out.println("Input your age: ");
        int age = in.nextInt();

        System.out.println(firstName + ", " + age + " лет");
        in.close();
    }
}
