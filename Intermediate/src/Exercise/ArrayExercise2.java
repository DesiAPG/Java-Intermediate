package Exercise;

import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float array[] = new float[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a float number into the array [" + i + "]: ");
            array[i] = input.nextFloat();
        }

        System.out.println("Your array data is: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
