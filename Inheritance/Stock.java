
public class Stock {
    String item;
    int qty;
    int rate;
    int amt;

    Stock(String s, int q, int r) {
        item = s;
        qty = q;
        rate = r;
        amt = q * r;
    }

    void display() {
        System.out.println("Item " + item);
        System.out.println("Quantity " + qty);
        System.out.println("Rate " + rate);
        System.out.println("Amount " + amt);
    }
}