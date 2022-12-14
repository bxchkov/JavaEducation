package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        Random random = new Random();
        int size = 3 + random.nextInt(12); // диапозон [3-15]
        int[] nums = new int[size];
        int[] reverseNums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(100);
        }
        System.out.println("Получившийся массив - " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Отсортированный массив - " + Arrays.toString(nums));
        for (int i = 0; i < size; i++) {
            reverseNums[i] = nums[(size-1) - i];
        }
        System.out.println("Отсортированный в порядке убывания массив - " + Arrays.toString(reverseNums));
    }
}