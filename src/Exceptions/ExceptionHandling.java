package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // a) InputMismatchException: Occurs if the input is not an integer
            System.out.print("Please enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);

            // b) ArrayIndexOutOfBoundsException: Accessing an invalid array index
            int[] arr = {1, 2, 3};
            int element = arr[5]; // Invalid index; will throw ArrayIndexOutOfBoundsException
            System.out.println("Element at index 5: " + element);

            // c) NullPointerException: Calling a method on a null reference
            String text = null;
            int length = text.length(); // Will throw NullPointerException
            System.out.println("Length of the text: " + length);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.")
            // Clear the scanner buffer if needed
            scanner.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid array index.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to call a method on a null object.");
        } finally {
            scanner.close();
            System.out.println("Scanner has been closed.");
        }

        System.out.println("End of program.");
    }
}
