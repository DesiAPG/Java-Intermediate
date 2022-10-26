package Exercise;
import java.util.Scanner;

public class ArrayExercise {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a value into the array [" + i + "] : ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
