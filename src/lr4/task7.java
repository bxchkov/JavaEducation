package lr4;

import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] arr = new int[rows][cols];
        Random random = new Random();
        int count = 1;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[i][(i % 2 == 0? j : cols-1 - j)] = count++;
            }
            for (int j = 0; j < cols; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
