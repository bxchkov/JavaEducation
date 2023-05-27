package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task10 {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = filter(arr, 3);
        System.out.println(result);

    }

    public static List<Integer> filter(List<Integer> arr, int value) {
        List<Integer> result = new ArrayList<>();
        for (Integer numbers : arr)
            if (numbers < value)
                result.add(numbers);
        return result;
    }
}