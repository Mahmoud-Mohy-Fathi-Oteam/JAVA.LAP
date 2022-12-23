package InterfaceCircle;
import java.util.*;
public class MainCircleCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;
        double m, n;
        Circle cr =new Circle();
        Cylinder cy =new Cylinder();
        System.out.println("         welcome");
        while(true){
            System.out.println("enter siutable");
            System.out.println("1-get the area of circule");
            System.out.println("2-get the area of cylinder");
            System.out.println("3-exit");
            b =input.nextInt();
            switch (b){
                case 1:
                    System.out.print(" enter radious of circle ");
                    m =input.nextDouble();
                    cr.setRadius(m);
                    System.out.print("the area of the circule is "+ cr.getarea());
                    break;
                case 2:
                    System.out.print(" enter the radious of cylinder ");
                    m =input.nextDouble();

                    cr.setRadius(m);
                    System.out.print(" enter the hight of cylinder ");
                    n =input.nextDouble();
                    cy.setHeight(n);

                    System.out.print("the area of the cylinder is "+cy.getvolum());
                    break;
                case 3:
                    return;
            }
        }
    }
}
