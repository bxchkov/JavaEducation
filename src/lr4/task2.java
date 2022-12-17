package lr4;

public class task2 {
    public static void main(String[] args) {
        int size = 11; // число строк которое необходимо вывести
        for (int i = 0 ; i < size; i++){
            for (int j = 0; j < i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
