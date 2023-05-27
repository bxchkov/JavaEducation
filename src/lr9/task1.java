package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];

        try {
            System.out.println("1-е число");
            array[0] = sc.nextInt();
            System.out.println("2-е число");
            array[1] = sc.nextInt();
            System.out.println("3-е число");
            array[2] = sc.nextInt();
            System.out.println(IntStream.of(array).average());


        } catch (InputMismatchException e) {
            System.err.println("Необходимо ввести целое число");
        }
    }


}
