package lr7.task4;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        supA obj1 = new supA('G');
        subB obj2 = new subB('D', "Привет!");
        subC obj3 = new subC('B', "Пока!", 189);
        subB clone2 = (subB) obj2.clone();
        subC clone3 = (subC) obj3.clone();
        System.out.println("Char n: " + obj1.getN());
        System.out.println("Char n: " + obj2.getN() + " String j: " + obj2.getJ());
        System.out.println("Char n: " + obj3.getN() + " String j: " + obj3.getJ() + " Int num: " + obj3.getNum());
    }
}
