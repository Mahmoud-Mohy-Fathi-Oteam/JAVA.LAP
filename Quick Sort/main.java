package quickSort;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Enter the matrix values
        int[] d= { 8, 7, 2, 1, 0, 9, 6,3,4 };
        System.out.print("Unsorted Array = ");
        System.out.println(Arrays.toString(d));
        int s = d.length;
        // call quicksort() on array data
        sort.Soort(d, 0, s - 1);
        System.out.print("Sorted Array =   ");
        System.out.print(Arrays.toString(d));
    }
}