package lr1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner in = new Scanner(System.in);
        boolean isInt = false;
        while(!isInt){
            String line = in.next();
            try {
                int num = Integer.parseInt(line);
                isInt = true;
                System.out.println("Your number: " + num);
            } catch (NumberFormatException exception) {
                System.out.println("It isn't number, try again:");
            }
        }
    }
}