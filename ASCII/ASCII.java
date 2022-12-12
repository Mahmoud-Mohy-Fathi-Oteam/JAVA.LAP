import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        //Just enter numbers from the keyboard to display a value ASCII for each number
        int val;
        do {
            char ascii;
            Scanner h = new Scanner(System.in);
            System.out.print("Enter The Value: \t");
            val = h.nextInt();
            ascii = (char) val;
            System.out.println("The Output Is: \t " + ascii);
        //Enter the value of zero to end the program
        } while (val != 0);
            System.out.println("Close program");
    }
}