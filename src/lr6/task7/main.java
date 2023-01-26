package lr6.task7;

public class main {
    public static void main(String[] args) {
        char[] ch1 = {'a', 'b', 'c', 'd'};
        task7 obj1 = new task7();
        int[] code = obj1.textCode(ch1);
        for (int i = 0; i < code.length - 1; i++) {
            System.out.print(code[i] + " ");
        }
    }
}
