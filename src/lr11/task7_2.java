package lr11;

import java.util.LinkedList;


public class task7_2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("LinkedList\n");
        LinkedList<Integer> humanArray = new LinkedList<>();

        int human = 14;

        long start = System.nanoTime();

        for (int i = 1; i <= human; i++) {
            humanArray.add(i);
            System.out.println(humanArray);
        }

        int i = 0;
        while (humanArray.size() > 1) {
            i = (i + 1) % humanArray.size();
            humanArray.remove(i);
            i--;
            System.out.println(humanArray);
        }

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("\nВремя выполнения: " + elapsed + " нс");
    }

}