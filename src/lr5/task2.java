package lr5;

public class task2 {
    char ch1 = 'A';
    char ch2 = 'D';
    int i = ch1;
    int j = ch2;
    void put() {
        for (i = ch1; i <= j; i++) {
            System.out.println(ch1);
            ch1++;
        }
    }
}
class chars {
    public static void main(String[]args){
        task2 ob1 = new task2();
        ob1.put();
    }
}