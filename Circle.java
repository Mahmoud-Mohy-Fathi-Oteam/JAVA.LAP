package InterfaceCircle;

public class Circle {


    public double Radius;
    public String color;

    public Circle() {
        Radius=1.0;
        color="red";
    }

    public Circle(double r) {
        Radius = r;
    }

    public Circle(double r, String c) {
        Radius = r;
        color = c;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return Radius;
    }

    public double getarea() {

        return 3.14 * Radius * Radius;

    }

    @Override
    public String toString() {
        return "circle{" + "Radius=" + Radius + ", color=" + color + '}';
    }
}
