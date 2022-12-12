package Shapes;

public class triangle {
    double base;
    double height;
    double length;
    public triangle (double b , double h , double l) {
        base = b ;
        height = h ;
        length = l ;
    }
    //Calculating the area of a triangle
    public double Tarea  () {
        return ((base/2)*height);
    }
    //Calculating the perimeter of a triangle
    public double Tperimeter () {
        return (base + height + length);
    }
    //Print area and perimeter of a triangle
    public void print(){
        System.out.println("Area Triangle = " + Tarea());
        System.out.println("Perimeter Triangle = " + Tperimeter());
    }
}

