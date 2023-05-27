package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task8 {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int size = 3;
        List<Integer> result = filter(arr, size);
        System.out.println(result);

    }

    public static List<Integer> filter(List<Integer> arr, int size) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : arr)
            if (number > size)
                result.add(number);
        return result;
    }
}