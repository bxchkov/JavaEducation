package lr7.task4;

public class supA implements Cloneable {
    public char n;

    supA(char p) {
        n = p;
    }

    @Override
    public supA clone() throws CloneNotSupportedException {
        System.out.println("Клон supA создан ");
        return (supA) super.clone();
    }

    void setN(char n1) {
        this.n = n1;
    }

    char getN() {
        return n;
    }

}
