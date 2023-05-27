package lr11;

public class task1 {

    public static void main(String[] args) {
        System.out.println(fib(5, 0));
    }

    public static int fib(int n, int b) {
        String a = "";
        for (int i = 0; i < b; i++) {
            a += "  ";
        }
        System.out.println(a + "fact(" + n + ")");
        if (n == 0)  return 0;
        else if (n == 1)  return 1;
        else {
            int result = fib(n - 2, b + 1) + fib(n - 1, b + 1);
            System.out.println(a + "  return " + result);
            return result;
        }
    }

}

