package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5 {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("раздавить", "распустить", "разуться", "разделить", "распилить");
        String word = "раз";
        List<String> result = filter(arr, word);
        System.out.println(result);

    }

    public static List<String> filter(List<String> arr, String word) {
        List<String> result = new ArrayList<>();
        for (String e : arr)
            if (e != null && e.contains(word))
                result.add(e);
        return result;
    }
}