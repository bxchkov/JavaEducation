package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа выводит последовательность чисел Фибоначчи. Введите число, определяющее кол-во чисел в послед-ти:");
        boolean isInt = false;
        while (!isInt){
            String line = in.next();
            try {
                int num = Integer.parseInt(line);
                isInt = true;
                int[] nums = new int[num];
                nums[0] = 1;
                nums[1] = 1;
                int i = 2;
                while (i < num){
                    nums[i] = (nums[i-2]+nums[i-1]);
                    System.out.println(nums[i-2] + " + " + nums[i-1] + " = " + (nums[i]));
                    System.out.println("К числам Фибоначчи добавлено число " + nums[i]);
                    i++;
                }
                System.out.println("Итоговая последовательность чисел Фибоначчи: " + Arrays.toString(nums));
            }
            catch (NumberFormatException exception){
                System.out.println("Это не число, попробуйте снова:");
            }
        }
    }
}
