package timus.any10;

import java.util.Scanner;

public class task2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        int count = scanner.nextInt();
        int mcount = count;
        int sum = 0;

        while (mcount > 0) {
            int mark = scanner.nextInt();
            if (mark == 3) {
                result = "None";
            }
            sum += mark;
            mcount--;
        }
        scanner.close();

        if (result.equals("")) {
            double avg = (double) sum / (double) count;
            if (avg == 5.0) result = "Named";
            else if (avg >= 4.5) result = "High";
            else result = "Common";
        }

        System.out.println(result);
    }
}
