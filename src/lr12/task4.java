package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task4 {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(2, 4, 6);
        List<Integer> result = filter(arr);
        System.out.println(result);

    }

    public static List<Integer> filter(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputList)
            result.add(number * number);
        return result;
    }
}