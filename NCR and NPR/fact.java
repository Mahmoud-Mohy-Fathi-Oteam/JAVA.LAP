package Lap2;

public class fact {
    public static int fact(int num) {
        int fact = 1, i;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}