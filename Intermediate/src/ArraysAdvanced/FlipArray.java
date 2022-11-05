package ArraysAdvanced;

import java.util.Scanner;

public class FlipArray {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = input.nextInt();
        int array[] = new int[n];
        int arrayReverse[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value in the position [" + i + "]");
            array[i] = input.nextInt();
        }

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayReverse[j] = array[i];
        }

        for (int i = 0; i < arrayReverse.length; i++) {
            System.out.println("The array reversed is: ");
            System.out.println(arrayReverse[i]);
        }
    }
}
