package lr4;

public class task4 {
    public static void main(String[] args) {
        int[][] arr = {
                {2},
                {2,2},
                {2,2,2},
                {2,2,2,2},
                {2,2,2,2,2},
                {2,2,2,2,2,2},
        };
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
