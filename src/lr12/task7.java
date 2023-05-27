package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task7 {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("программа", "код", "обучение");
        int length = 5;
        List<String> result = filter(arr, length);
        System.out.println(result);

    }
    public static List<String> filter(List<String> arr, int length) {
        List<String> result = new ArrayList<>();
        for (String string : arr)
            if (string.length() > length)
                result.add(string);
        return result;
    }
}