package lr5;

public class task4 {
    char ch1;
    int num;

    task4(char i, int j) {
        ch1 = i;
        num = j;
    }

    task4(double w) {
        int k = (int) w;
        ch1 = (char) k;
        num = (int) ((w - k) * 100);

    }
}

class constr {
    public static void main(String[] args) {
        task4 ob1 = new task4('g', 43);
        task4 ob2 = new task4(65.1267);
        char ch = ob1.ch1;
        int n = ob1.num;
        System.out.println(ch + " " + n);
        System.out.println(ob2.ch1 + " " + ob2.num);

    }
}
