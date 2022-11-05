package ArraysDataStructures;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[];
        int n;
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        System.out.print("Enter the size of the array: ");
        n = input.nextInt();
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value for the position [" + i + "]: ");
            array[i] = input.nextInt();
            if (array[i] > 0) {
                positiveCounter++;
            } else if (array[i] < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }

        int positiveArray[] = new int[positiveCounter];
        int negativeArray[] = new int[negativeCounter];

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                positiveArray[n] = array[i];
                positiveCounter++;
            } else if (array[i] < 0) {
                negativeArray[n] = array[i];
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }
        for (int i = 0; i < positiveCounter; i++) {
            System.out.println(positiveArray[i]);
        }
        for (int i = 0; i < negativeArray.length; i++) {
            System.out.println(negativeArray[i]);
        }
        System.out.println("\nThe number of zeros are: " + zeroCounter);
    }
}
