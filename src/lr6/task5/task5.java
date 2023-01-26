package lr6.task5;

public class task5 {
    int sqr(int n) {
        int result;
        if (n == 1) return 1;
        result = sqr(n - 1) + n * n;
        return result;
    }
}
