package lr5;

public class task6 {
    private int max = 10;
    private int min = 5;
    task6(int i, int j) {
        if (i > j && i > max ) {
            max = i;
        }
        else if (j > i && j > max) {
            max = j;
        } else if (i < j && i < min) {
            min = i;
        } else if (j < i && j < min) {
            min = j;
        }
    }
    task6(int k) {
        if (k > max) {
            max = k;
        } else if (k < min) {
            min = k;
        }
    }
    void show() {
        System.out.println(max + " " + min);
    }
}
class toConsole {
    public static void main(String[] args) {
        task6 ob1 = new task6(5, 99);
        task6 ob2 = new task6(1, 2);
        task6 ob3 = new task6(1);
        ob1.show();
        ob2.show();
        ob3.show();
    }
}