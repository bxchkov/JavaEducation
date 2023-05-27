package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("Первая", "вторая", "Третья");
        List<String> result = filter(arr);
        System.out.println(result);

    }

    public static List<String> filter(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String e : inputList)
            if (e != null && !e.isEmpty() && Character.isUpperCase(e.charAt(0)))
                result.add(e);
        return result;
    }
}