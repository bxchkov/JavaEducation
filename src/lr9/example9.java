package lr9;

public class example9 {

    public static int i() {
        try {
            System.out.println("0");
            return 999;  // Выход из метода
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(i());
    }

}
