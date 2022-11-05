package ArraysMedium;

import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[];
        int n;
        boolean crecient = false;
        boolean decrecient = false;
        boolean negative = false;

        System.out.print("Enter the number of elements in the array: ");
        n = input.nextInt();

        // Check if the elements of the array is lower than 0
        if (n < 0) {
            System.out.println("Error only positive numbers permited");
            System.exit(0);
        }

        array = new int[n];

        do {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter the value in the position [" + i + "]: ");
                array[i] = input.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    negative = true;
                    break;
                } else {
                    negative = false;
                }
            }

            if (negative == true) {
                System.out.println("\nError only positive numbers permited\n");
            }

        } while (negative == true);

        for (int i = 0; i < n - 1; i++) {
            if (array[i] < array[i + 1]) {
                crecient = true;
            } else if (array[i] > array[i + 1]) {
                decrecient = true;
            }
        }

        if (crecient == true && decrecient == false) {
            System.out.println("The array is crecient");
        } else if (decrecient == true && crecient == false) {
            System.out.println("The array is decrecient");
        } else if (crecient == true && decrecient == true) {
            System.out.println("The array is unordained");
        } else {
            System.out.println("The values of the array are all the same");
        }
    }
}
