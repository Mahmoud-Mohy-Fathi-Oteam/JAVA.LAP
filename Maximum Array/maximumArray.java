import java.util.Scanner;

public class maximumArray {
    public static void main(String[] args) {
        //Insert 5 numbers into the array and print the largest value
        Scanner input = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter an array of 5 number");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The max number in the matrix = " + max);
    }
}