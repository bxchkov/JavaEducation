package lr7.task2;

public class main {
    public static void main(String[] args) {
        subClass obj = new subClass("Привет", 8);
        System.out.println("str1 " + obj.showStr() + " Num " + obj.getNum());
        obj.setStr1("Еще чуть-чуть!");
        System.out.println("str1 " + obj.showStr() + " Num " + obj.getNum());
        obj.setNum(12);
        System.out.println("str1 " + obj.showStr() + " Num " + obj.getNum());
        obj.setAll("Уже все!", 18);
        System.out.println("str1" + obj.showStr() + " Num " + obj.getNum());
    }
}