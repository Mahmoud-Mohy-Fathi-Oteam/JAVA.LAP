import java.util.Scanner;

public class transposeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //Enter the values of the matrix 3 by 3
            int[][] arr;
            System.out.println("Enter a matrix 3*3 ");
            arr = new int[3][3];
            //He counts on the matrix to take the numbers from it
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            //Converts a row to a column and a column to a row
            System.out.println("The output value : ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println(" ");
            }
    }
}