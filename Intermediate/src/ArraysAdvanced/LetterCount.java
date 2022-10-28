package ArraysAdvanced;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String array[] = new String[20];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the text for the position [" + i + "]: ");
            array[i] = input.next();
        }

        int highest = array[0].length();
        int lowest = array[0].length();
        String nHighest = array[0];
        String nLowest = array[0];
        int highestPosition = 0;
        int lowestPosition = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].length() >= highest) {
                nHighest = array[i];
                highest = array[i].length();
                highestPosition = i;
            }

            if (array[i].length() <= lowest) {
                nLowest = array[i];
                lowest = array[i].length();
                lowestPosition = i;
            }
        }

        System.out.println(
                "\nThe string that has more letter is: " + "'" + nHighest + "'" + " with " + highest + " letters"
                        + " In the position [" + highestPosition
                        + "]");
        System.out.println(
                "\nThe string that has less letter is: " + "'" + nLowest + "'"
                        + " with "
                        + lowest + " letters" + " In the position [" + lowestPosition + "]");
    }
}
