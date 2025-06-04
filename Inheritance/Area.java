/*
A superclass Perimeter has been defined to calculate the perimeter of a parallelogram. Define a subclass Area to compute the area of the parallelogram by using the required data members of the superclass. The details are given below: 
Class name: Perimeter
Data members/instance variables:
a: to store the length in decimal
b: to store the breadth in decimal
Member functions:
Perimeter (…): parameterized constructor to assign values to data members
double Calculate(): calculate and return the perimeter of a parallelogram is 2* (length + breadth)
void show(): to display the data members along with the perimeter of the parallelogram
Class name: Area
Data members/instance variables:
h: to store the height in decimal
area: to store the area of the parallelogram
Member functions:
Area(…): parameterized constructor to assign values to data members of both the classes
void doarea(): compute the area as (breadth * height)
void show(): display the data members of both classes along with the area and perimeter of the parallelogram.
Specify the class Perimeter giving details of the constructor (…), double Calculate and void show (). Using the concept of inheritance, specify the class Area giving details of the constructor (…), void doarea () and void show (). The main function and algorithm need not be written.
*/
public class Area extends Perimeter {
    double h, area;

    Area(double x, double y, double height) {
        super(x, y);
        h = height;
        area = 0;
    }

    void doarea() {
        area = b * h;
    }

    void show() {
        super.show();
        System.out.println("Height " + h);
        System.out.println("Area " + area);
    }

    public static void main(String[] args) {
        Area obj = new Area(5, 5, 5);
        obj.doarea();
        obj.show();
    }
}
