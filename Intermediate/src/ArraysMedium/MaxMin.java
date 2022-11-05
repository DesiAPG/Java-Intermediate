package ArraysMedium;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[];
        int highest;
        int lowest;
        int highestPosition = 0;
        int lowestPosition = 0;

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("\nEnter the number for the position [" + i + "]: ");
            array[i] = input.nextInt();

        }

        highest = array[0];
        lowest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (highest < array[i]) {
                highest = array[i];
                highestPosition = i;
            }
            if (lowest > array[i]) {
                lowest = array[i];
                lowestPosition = i;
            }
        }

        System.out.println("\nThe highest number is: " + highest + " In the position [" + highestPosition + "]");
        System.out.println("\nThe lowest number is: " + lowest + " In the position [" + lowestPosition + "]");
    }
}
