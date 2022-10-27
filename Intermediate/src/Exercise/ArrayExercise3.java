package Exercise;

import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float higher = 0;
        float lower = 0;
        float average;
        float alturas[];
        float addition = 0;
        int n;
        
        System.out.print("Enter the number of values: ");
        n = input.nextInt();
        alturas = new float[n];

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Enter the value for the height [" + i + "]");
            alturas[i] = input.nextFloat();
            addition += alturas[i];
        }

        average = addition / n;

        for (int i = 0; i < alturas.length; i++) {
            System.out.println(alturas[i]);
        }

        System.out.println("The height average is : " + average);

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > average) {
                higher++;
            } else if (alturas[i] < average) {
                lower++;
            }
        }

        System.out.println("The number of heights that are higher than average are: " + higher);
        System.out.println("The number of heights that are lower than average are: " + lower);
    }
}
