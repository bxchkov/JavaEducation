package lr9;

public class example12 {

    public static void i(String str, double num) {
        if (str == null)
            throw new IllegalArgumentException("Строка введена неверно");
        if (num > 0.001)
            throw new IllegalArgumentException("Неверное число");
    }

    public static void main(String[] args) {
        i(null, 0.000001);
    }

}
