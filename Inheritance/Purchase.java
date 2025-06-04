/*
A superclass Stock has been defined to store the details of the stock of a retail store. Define a subclass Purchase to store the details of the items purchased with the new rate and updates the stock. Some of the members of the classes are given below: [10]
Class name: Stock
Data members/instance variables:
item: to store the name of the item
qt: to store the quantity of an item in stock
rate: to store the unit price of an item
amt: to store the net value of the item in stock
Member functions:
Stock (…): parameterized constructor to assign values to the data members
void display(): to display the stock details
Class name: Purchase
Data members/instance variables:
pqty: to store the purchased quantity
prate: to store the unit price of the purchased item
Member functions/ methods:
Purchase(…): parameterized constructor to assign values to the data members of both classes
void update (): to update stock by adding the previous quantity by the purchased quantity and replace the rate of the item if there is a difference in the purchase rate. Also, update the current stock value as (quantity * unit price)
void display(): to display the stock details before and after updation.
Specify the class Stock, giving details of the constructor() and void display(). Using the concept of inheritance, specify the class Purchase, giving details of the constructor(), void update() and void display().
The main function and algorithm need not be written.
*/
public class Purchase extends Stock {
    int pqty;
    int prate;

    Purchase(String i, int q, int r, int pq, int pr) {
        super(i, q, r);
        pqty = pq;
        prate = pr;
    }

    void update() {
        qty = super.qty + pqty;
        if (prate == rate)
            ;
        else {
            rate = prate;
        }
        super.amt = super.qty * super.rate;
    }

    void display() {
        super.display();
        update();
        super.display();
    }

    public static void main(String[] args) {
        Purchase obj = new Purchase("shirt", 300, 200, 400, 500);
        obj.display();
    }
}
