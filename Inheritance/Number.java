public class Number {
    int n;

    Number(int nn) {
        n = nn;
    }

    int factorial(int a) {
        int c = 1;
        for (int i = 1; i <= a; i++) {
            c = c * i;
        }
        return c;
    }

    void display() {

        System.out.println("Number is " + n);
    }
}
