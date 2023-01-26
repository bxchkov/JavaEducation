package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int[] nums = new int[0];
        System.out.println("""
                Программа выводит сумму n-го кол-ва чисел,
                которые при делении на 5 имеют остаток 1, а при 3 - 1.
                Введите число(n), определяющее кол-во чисел/длину массива:""");
        while (num < 2){
            String line = in.next();
            try {
                num = Integer.parseInt(line);
                if (num < 2){
                    System.out.println("Введите число не меньше 2:");
                } else {
                    nums = new int[num];
                    int nums_i = 0;
                    int i = 0;
                    while (nums_i < num) {
                        if (i % 5 == 2 && i % 3 == 1){
                            nums[nums_i] = i;
                            sum = sum + i;
                            nums_i++;
                            System.out.println(nums_i + "-е число соответствующее требованиям: " + i);
                        }
                        i++;
                    }
                }
                System.out.println("Сумма " + num + " чисел, отвечающих требованиям: " + Arrays.toString(nums) + ", равна " + sum);
            }
            catch (NumberFormatException exception){
                System.out.println("Это не целое число, попробуйте снова:");
            }
        }
    }
}
