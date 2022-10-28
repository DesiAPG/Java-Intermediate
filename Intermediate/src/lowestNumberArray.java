import java.util.Scanner;

public class lowestNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter the size of the array: ");
        n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for the position [" + i + "]: ");
            array[i] = input.nextInt();
        }

        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (lowest > array[i]) {
                lowest = array[i];
            }
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (lowest == array[i]) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("The lowest number in the array is: " + lowest + " and it is not repeated");
        } else {
            System.out.println(
                    "The lowest number in the array is: " + lowest + " and it is repeated " + counter + " times");
        }

    }
}
