package Predavanje.predavanje_13_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean tocanUnos = true;
        int number = 0;
        System.out.println("Unesi broj ");

        while (tocanUnos) {
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();

                System.out.println(racunajFakturijel(number));
                tocanUnos = false;
            } catch (InputMismatchException e) {
                System.out.println(" Unesi tocan broj " + e);
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static Integer racunajFakturijel(Integer number) throws Exception {
        if (number < 0) {
            throw new Exception("Broj mora biti veci od nule");
        }
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
