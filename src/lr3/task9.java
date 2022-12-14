package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = id.nextInt();
        System.out.println("Размер массива - " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        System.out.println("Получившийся массив - " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Отсортированный массив: " + Arrays.toString(nums));
        System.out.println("Значение наименьшего элемента массива: "+nums[0]+" [0]");
        if (nums[0] == nums[1]){
            System.out.println("Одинаковые с наименьшим элементы массива:");
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[0]) {
                    System.out.println(nums[i] + " ["+i+"]");
                }
            }
        }
    }
}