/*
An interface Data is defined with a data member and a method volume( ) which returns the volume of the implementing shape. A super class Base has been defined to contain the radius of a geometrical shape. Define a sub class CalVol which uses the properties of the interface Data and the class Base and calculates the volume of a cylinder.
The details of the members of the interface and both the classes are given below:
Interface name	Data
Data member:	
double pi	initialize pi = 3.142
Member functions/methods:	
double volume( )	
Class name:	Base
Data member/instance variable:	
rad	to store the radius in decimal
Member functions/methods:	
Base(…)	parameterized constructor to initialize the data member
void show( )	displays the radius with an appropriate message
Class name:	CalVol
Data member/instance variable:	
ht	to store the height in decimal
Member functions/methods:	
CalVol(…)	parameterized constructor to initialize the data members of both the classes
double volume( )	calculates the volume of a sphere by using the formula ( pi x radius^2 x height )
void show( )	displays the data members of both the classes and the volume of the sphere with appropriate message

Assume that the interface Data and the super class Base has been defined. Using the concept of inheritance, specify the class CalVol giving the details of the constructor(…), double volume( ) and void show( ).
The interface, super class, main function, and algorithm need NOT be written.
*/
public class CalVol extends Base implements Data {
    double ht;

    CalVol(double x, double y) {
        super(x);
        ht = y;
    }

    public double volume() {
        double vol = pie * rad * rad * ht;
        return vol;
    }

    public void show() {
        super.show();
        System.out.println("height " + ht);
        System.out.println("vol" + volume());
    }

    public static void main(String[] args) {
        CalVol obj = new CalVol(5, 5);
        obj.show();
    }
}
