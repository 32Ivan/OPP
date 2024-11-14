package Predavanje.predavanje_14_11_io;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File outputFile = new File("src/Predavanje/predavanje_14_11_io/student.txt");

        FileWriter out = new FileWriter(outputFile);

        int i = 1;
        while (i < 4) {
            Student student = dodajNovogStudenta();

            try {
                out.write(student.toString() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            i++;
        }

        out.close();
        System.out.println("Broj znakova je : " + brojZnakovaUDatoteci(outputFile));
    }


    public static Student dodajNovogStudenta() {
        while (true) {
            try {
                System.out.println("Unesite ime studenta: ");
                String ime = scanner.nextLine();

                System.out.println("Unesite prezime studenta: ");
                String prezime = scanner.nextLine();

                System.out.println("Unesite broj indexa studenta: ");
                Integer brojIndexa = scanner.nextInt();
                scanner.nextLine();

                return new Student(ime, prezime, brojIndexa);

            } catch (InputMismatchException e) {
                System.out.println("Pokušajte ponovo.");
                scanner.nextLine();

            } catch (Exception e) {
                System.out.println("Došlo je do greške: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    public static int brojZnakovaUDatoteci(File file) {

        int brojZnakova = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            int karakter;

            while ((karakter = reader.read()) != -1) {
                brojZnakova++;
            }
        } catch (IOException e) {
            System.out.println("Greška pri čitanju datoteke.");
            e.printStackTrace();
        }

        return brojZnakova;
    }


}
