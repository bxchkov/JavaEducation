package lr6.task4;

public class task4 {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 2) * n;
        return result;
    }
}
