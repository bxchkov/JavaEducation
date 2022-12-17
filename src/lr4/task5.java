package lr4;

import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int[][] arr = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j< cols; j++){
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < cols; i++){
            for (int j = 0; j< rows; j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
