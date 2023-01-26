package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int[] nums = new int[0];
        System.out.println("""
                Программа выводит массив из чисел,
                которые при делении на 5 дают в остатке 2.
                Введите целое число(n), определяющее кол-во чисел/длину массива:""");
        while (num < 1){
            String line = in.next();
            try {
                num = Integer.parseInt(line);
                if (num < 1){
                    System.out.println("Массив должен состоять хотя-бы из 1-го элемента:");
                } else {
                    nums = new int[num];
                    int nums_i = 0;
                    for (int i = 0; nums_i < num; i++){
                        if (i % 5 == 2){
                            nums[nums_i] = i;
                            nums_i++;
                            System.out.println(nums_i + "-е число соответствующее требованиям: " + i);
                        }
                    }
                    if (num < 2){
                        System.out.println("Получился массив из " + num + " элемента: " + Arrays.toString(nums));
                    } else {
                        System.out.println("Получился массив из " + num + " элементов: " + Arrays.toString(nums));
                    }
                }
            }
            catch (NumberFormatException exception){
                System.out.println("Это не целое число, попробуйте снова:");
            }
        }
    }
}
