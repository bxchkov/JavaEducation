package lr4;

import java.util.Random;

public class task6 {
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
        int delRow = random.nextInt(rows);
        int delCol = random.nextInt(cols);
        System.out.println("Будет удалена "+(delRow+1)+" строка");
        System.out.println("Будет удалена "+(delCol+1)+" колонка");
        System.out.println();
        for (int i = 0; i < rows; i++){
            if(i == delRow)
                continue;
            for (int j = 0; j< cols; j++){
                if(j == delCol)
                    continue;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
