package Shapes;

public class circle {
    double radius;
    public circle (double r){
        radius = r;
    }
    //Calculating the area of a circle
    public double Carea() {
        return (double) (3.14*(radius*radius));
    }
    //Calculating the circumference of a circle
    public double Cperimeter (){
        return (double) (3.14*(radius*2));
    }
    //Print the area and circumference of a circle
    public void print () {
        System.out.println("Area Circle =" + Carea());
        System.out.println("Primater Circle ="+ Cperimeter());
    }
}
