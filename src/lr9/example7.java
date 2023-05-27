package lr9;

public class example7 {

    public static void main(String[] args) throws ArithmeticException {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }

}
