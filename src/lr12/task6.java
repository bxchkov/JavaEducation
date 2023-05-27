package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task6 {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 4, 15, 18, 22);
        int number = 2;
        List<Integer> result = filter(arr, number);
        System.out.println(result);

    }

    public static List<Integer> filter(List<Integer> arr, int number) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : arr)
            if (num % number == 0)
                result.add(num);
        return result;
    }
}