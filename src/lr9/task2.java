package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1-е число");
            int i = sc.nextInt();
            System.out.println("2-е число");
            int j = sc.nextInt();
            System.out.println(arr[i][j]);
        } catch (InputMismatchException e) {
            System.err.println("Необходимо ввести целое число");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Нет столбца с таким номером, максимальное число строк/столбцов - 2");
        }
    }

}
