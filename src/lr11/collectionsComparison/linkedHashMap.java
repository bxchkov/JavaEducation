package lr11.collectionsComparison;

import java.util.LinkedHashMap;

public class linkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        System.out.println("LinkedHashMap\n");
        System.out.println("Добавление элемента в начало: " + getElemAddingTime1(linkedHashMap) + " мс");
        System.out.println("Добавление элемента в конец: " + getElemAddingTime2(linkedHashMap) + " мс");
        System.out.println("Добавление элемента в середину: " + getElemAddingTime3(linkedHashMap) + " мс\n");
        System.out.println("Удаление элемента с начала: " + getElemDeletingTime1(linkedHashMap) + " мс");
        System.out.println("Удаление элемента с конца: " + getElemDeletingTime2(linkedHashMap) + " мс");
        System.out.println("Удаление элемента с середины: " + getElemDeletingTime3(linkedHashMap) + " мс\n");
        System.out.println("Получение элемента: " + getElemByIndexTime(linkedHashMap) + " мс");

    }

    private static long getElemAddingTime1(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.put(i, i);

        // блок кода в котором выполняется операция добавления элемента в начало
        LinkedHashMap<Integer, Integer> list2 = new LinkedHashMap<>(list);
        list.clear();
        list.put(-1, -1);
        list.putAll(list2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();
        list2.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemAddingTime2(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.put(i, i);

        // блок кода в котором выполняется операция добавления элемента в конец
        list.put(6 * 1000000 + 1, 6 * 1000000 + 1);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemAddingTime3(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++) {
            if (i == 6 * 1000000 / 2) continue;
            list.put(i, i);
        }
        // блок кода в котором выполняется операция добавления элемента в середину
        list.put(6 * 1000000 / 2, 6 * 1000000 / 2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemDeletingTime1(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.put(i, i);

        // блок кода в котором выполняется операция удаления элемента в начале
        list.remove(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemDeletingTime2(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.put(i, i);

        // блок кода в котором выполняется операция удаления элемента в конце
        list.remove(list.size());

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemDeletingTime3(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.put(i, i);

        // блок кода в котором выполняется операция удаления элемента в середине
        list.remove(list.size() / 2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemByIndexTime(LinkedHashMap<Integer, Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.put(i, i);

        // блок кода в котором выполняется операция получения элемента
        list.get(list.size() / 2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
