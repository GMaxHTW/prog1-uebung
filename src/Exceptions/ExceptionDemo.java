package Exceptions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        // a) InputMismatchException auslösen
        // Wenn der Benutzer etwas anderes als eine ganze Zahl eingibt (z.B. einen Buchstaben),
        // wird eine InputMismatchException geworfen.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte eine ganze Zahl eingeben: ");
        int zahl = scanner.nextInt(); // Bei falscher Eingabe InputMismatchException

        // b) ArrayIndexOutOfBoundsException auslösen
        int[] arr = {1, 2, 3};
        int element = arr[5]; // Index 5 ist außerhalb der Array-Grenzen

        // c) NullPointerException auslösen
        String text = null;
        int laenge = text.length(); // Zugriff auf Methode eines Null-Objekts löst NullPointerException aus

        scanner.close();
    }
}
