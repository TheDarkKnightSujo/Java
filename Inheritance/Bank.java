public class Bank {
    protected String name;
    protected String accno;
    protected double p;

    Bank(String n, String a, double pr) {
        name = n;
        accno = a;
        p = pr;
    }

    protected void display() {
        System.out.println("Name of the costumer " + name);
        System.out.println("Account number " + accno);
        System.out.println("Principal amount " + p);
    }
}