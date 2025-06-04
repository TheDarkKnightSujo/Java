public class Plane {
    static int x1, y1;

    Plane(int nx, int ny) {
        x1 = nx;
        y1 = ny;
    }

    void Show() {
        System.out.println("X coordinate " + x1);
        System.out.println("Y coordinate " + y1);
    }
}