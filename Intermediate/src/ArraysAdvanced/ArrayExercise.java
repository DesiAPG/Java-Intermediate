package ArraysAdvanced;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        int negatives = 0;
        int positives = 0;
        int pairs = 0;
        int odds = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number of the poition [" + i + "]: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 && array[i] > 0) {
                pairs++;
                positives++;
            } else if (array[i] % 2 != 0 && array[i] > 0) {
                odds++;
                positives++;
            } else if (array[i] % 2 == 0 && array[i] < 0) {
                pairs++;
                negatives++;
            } else if (array[i] % 2 != 0 && array[i] < 0) {
                odds++;
                negatives++;
            }
        }

        System.out.println("The number of positive numbers in the array are: " + positives);
        System.out.println("The number of negative numbers in the array are: " + negatives);
        System.out.println("The number of pairs numbers in the array are: " + pairs);
        System.out.println("The number of odds numbers in the array are: " + odds);

    }
}
