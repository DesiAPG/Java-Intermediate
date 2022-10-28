package ArraysAdvanced;

import java.util.Scanner;

public class AdultsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        int ages[] = new int[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name for the position [" + i + "]: ");
            names[i] = input.next();
            System.out.print("Enter the age for the position [" + i + "]: ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nThe aged people of the array are: ");

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("\nName: " + names[i]);
                System.out.println("Age: " + ages[i]);
            } else {
                System.out.println("There is no people aged in the array");
            }
        }

    }
}
