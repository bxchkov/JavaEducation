package lr11.collectionsComparison;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("ArrayList\n");
        System.out.println("Добавление элемента в начало: " + getElemAddingTime1(arrayList) + " мс");
        System.out.println("Добавление элемента в конец: " + getElemAddingTime2(arrayList) + " мс");
        System.out.println("Добавление элемента в середину: " + getElemAddingTime3(arrayList) + " мс\n");
        System.out.println("Удаление элемента с начала: " + getElemDeletingTime1(arrayList) + " мс");
        System.out.println("Удаление элемента с конца: " + getElemDeletingTime2(arrayList) + " мс");
        System.out.println("Удаление элемента с середины: " + getElemDeletingTime3(arrayList) + " мс\n");
        System.out.println("Получение элемента: " + getElemByIndexTime(arrayList) + " мс");

    }

    private static long getElemAddingTime1(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

        // блок кода в котором выполняется операция добавления элемента в начало
        list.add(0, 123);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemAddingTime2(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

        // блок кода в котором выполняется операция добавления элемента в конец
        list.add(123);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemAddingTime3(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

        // блок кода в котором выполняется операция добавления элемента в середину
        list.add(list.size() / 2, 123);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemDeletingTime1(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

        // блок кода в котором выполняется операция удаления элемента в начале
        list.remove(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemDeletingTime2(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

        // блок кода в котором выполняется операция удаления элемента в конце
        list.remove(list.size() - 1);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemDeletingTime3(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

        // блок кода в котором выполняется операция удаления элемента в середине
        list.remove(list.size() / 2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // очистка коллекции после всех операций
        list.clear();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getElemByIndexTime(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления элементов
        for (int i = 0; i < 6 * 1000000; i++)
            list.add(i);

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


