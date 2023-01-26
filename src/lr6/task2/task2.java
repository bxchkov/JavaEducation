package lr6.task2;

public class task2 {
    private static int k;

    static int getNum() {
        return k++;
    }
}

class testWiew {
    public static void main(String[] args) {
        task2 obj1 = new task2();
        int w, e, r;
        w = obj1.getNum();
        System.out.println(w);
        e = obj1.getNum();
        System.out.println(e);
        r = obj1.getNum();
        System.out.println(r);
    }
}
