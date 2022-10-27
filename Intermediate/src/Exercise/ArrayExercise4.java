package Exercise;

import java.util.Scanner;

public class ArrayExercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average1 = 0;
        int average2 = 0;
        int addition1 = 0;
        int addition2 = 0;
        int array1[] = new int[10];
        int array2[] = new int[10];

        System.out.println("First Array");
        System.out.println("");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter a value for the array 1 in the position [" + i + "]: ");
            array1[i] = input.nextInt();
            addition1 += array1[i];
        }
        System.out.println("");
        System.out.println("Second array");
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter a value for the array 2 in the position [" + i + "]: ");
            array2[i] = input.nextInt();
            addition2 += array2[i];
        }
        average1 = addition1 / 10;
        average2 = addition2 / 10;
        if (average1 > average2) {
            System.out.println("The highest average is the array 1: " + average1);
        } else if (average1 < average2) {
            System.out.println("The highest average is the array 2: " + average2);
        } else if (average1 == average2) {
            System.out.println("Both arrays have the same average: " + average1);

        }

    }
}
