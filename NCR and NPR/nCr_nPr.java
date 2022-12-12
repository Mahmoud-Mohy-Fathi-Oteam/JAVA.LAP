package Lap2;

import java.util.Scanner;

import static Lap2.fact.fact;

public class nCr_nPr {
    public static void main(String[] args) {
        //Enter a value for two numbers to calculate ncr and npr
        int n, r , ncr , npr ;
        Scanner scanner = new Scanner(System.in);
        fact fact = new fact();
        System.out.print("Enter Value of n : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of r : ");
        r = scanner.nextInt();
        //Function call fact to calculate the value of each ncr and npr
        ncr = (fact(n)/(fact(n-r)*fact(r)));
        npr = (fact(n)/(fact(n-r)));
        //Print the values of the calculations
        System.out.println("NCR is  = " + ncr) ;
        System.out.println("NPR is = " + npr);
    }
}
