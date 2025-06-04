public class Perimeter {
    double a, b;

    Perimeter(double x, double y) {
        a = x;
        b = y;
    }

    double Calculate() {
        return (2 * (a + b));
    }

    void show() {
        System.out.println("Lenght " + a);
        System.out.println("Breadth " + b);
        System.out.println("perimeter " + Calculate());
    }
}
