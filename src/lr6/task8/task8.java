package lr6.task8;

import java.util.stream.IntStream;

public class task8 {
    int[] arr;
    int set(int[] arr) {
        this.arr = arr;
        int total = IntStream.of(arr).sum();
        int avg = total / arr.length;
        return avg;
    }
}
