package PDF08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner input = new Scanner(System.in);
        double userInput = 0;

        while (true) {

            try {
                userInput = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbe: ");
                input.next();
            }
        }
        if (userInput < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek za liczby rzeczywistej %.4f nie istnieje!!", userInput));
        }
        System.out.println(String.format("Pierwiastek za liczby rzeczywistej %.4f to %.4f", userInput, Math.sqrt(userInput)));
    }


}