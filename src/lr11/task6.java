package lr11;

import java.util.HashMap;
import java.util.Map;

public class task6 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Ноль");
        hashMap.put(1, "Один");
        hashMap.put(2, "Два");
        hashMap.put(3, "Три");
        hashMap.put(4, "Четыре");
        hashMap.put(5, "Пять");
        hashMap.put(6, "Шесть");
        hashMap.put(7, "Семь");
        hashMap.put(8, "Восемь");
        hashMap.put(9, "Девять");

        System.out.println("Ключ больше 5\n");
        hashMap.entrySet()
                .stream()
                .filter(e -> e.getKey() > 5)
                .forEach(e -> System.out.println(e.getValue()));

        if (hashMap.containsKey(0)) {
            System.out.println("\nКлюч ноль");
            String[] values = hashMap.get(0).split(",");
            for (String value : values) {
                System.out.println(value.trim() + " ");

            }
        }
        int product = 1;
        for (String value : hashMap.values()) {
            if (value.length() > 5) {
                product *= hashMap.keySet()
                        .stream()
                        .filter(key -> hashMap.get(key).equals(value))
                        .findFirst()
                        .orElse(1);
            }
        }
        System.out.println("\nДлина строки больше 5: " + product);
    }
}