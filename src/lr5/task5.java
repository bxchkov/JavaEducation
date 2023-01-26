package lr5;

public class task5 {
    private int k;
    task5(int s) {
        k = Math.min(s, 100);
    }
    task5() {
        k = 0;
    }
    int result(){
        return k;
    }
}
class retu2 {
    public static void main(String[] args) {
        task5 ob1 = new task5(1);
        task5 ob2 = new task5(101);
        task5 ob3 = new task5();
        System.out.println(ob1.result()  +" "+ ob2.result() + " " + ob3.result());
    }
}