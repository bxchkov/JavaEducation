package lr5;

public class task3 {
    double width;
    double height;

    task3(task3 ob) {
        width = ob.width;
        height = ob.height;
    }

    task3(double w, double h) {
        width = w;
        height = h;
    }

    task3() {
        width = -1;
        height = -1;
    }

    task3(double len) {
        width = height = len;
    }

    double area() {
        return width * height;
    }
}

class areas {
    public static void main(String[] args) {
        task3 area1 = new task3(15, 20);
        task3 area2 = new task3();
        task3 area3 = new task3(9);
        double ar;
        ar = area1.area();
        System.out.println("Площадь area1 равна " + ar);
        ar = area2.area();
        System.out.println("Площадь area2 равна " + ar);
        ar = area3.area();
        System.out.println("Площадь area3 равна " + ar);
    }
}