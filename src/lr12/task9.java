package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task9 {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("aaaa", "aa11", "1111", "!!!!");
        List<String> result = filter(arr);
        System.out.println(result);

    }
    public static List<String> filter(List<String> arr) {
        List<String> result = new ArrayList<>();
        for (String string : arr)
            if (string.matches("[a-zA-Z]+"))
                result.add(string);
        return result;
    }
}