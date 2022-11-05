package ArraysAdvanced;

import java.util.Scanner;

public class DeleteItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        int position;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for the position [" + i + "]: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + array[i] + " In the position [" + i + "]");
        }

        System.out.print("Wich element do you want to delete: ");
        position = input.nextInt();

        for (int i = position; i < 9; i++) {
            array[i] = array[i + 1];
        }


    }
}
