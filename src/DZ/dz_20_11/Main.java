package DZ.dz_20_11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File outputFileProizvodi = new File("src/DZ/dz_20_11/proizvodi.txt");
        File outputFileSkupljiProizvodi = new File("src/DZ/dz_20_11/skupljiProizvodi.txt");

        List<Proizvod> proizvodi = new ArrayList<>();

        System.out.println("Koliko proizvoda zelis dodati na listu (broj mora biti veci ili jednak broju 5)");

        int brojProizvoda;
        try {
            brojProizvoda = scanner.nextInt();
            if (brojProizvoda < 5) {
                System.out.println("Broj proizvoda je manji od 5. Postavlja se na 5");

                brojProizvoda = 5;
            }

        } catch (Exception e) {
            System.out.println("Niste unijeli valjanu vrijednost. Postavlja se broj proizvoda na 5.");
            brojProizvoda = 5;
            scanner.nextLine();
        }


        while (brojProizvoda > 0) {
            scanner.nextLine();
            System.out.println("Preostalo proizvoda za unos: " + brojProizvoda);
            Proizvod proizvod = dodavanjeProizvodaUListu();
            proizvodi.add(proizvod);
            brojProizvoda--;
        }


        zapisivanjeProizvodaUDatoteke(proizvodi, outputFileProizvodi, outputFileSkupljiProizvodi);

    }

    public static Proizvod dodavanjeProizvodaUListu() {
        while (true) {
            try {
                System.out.println("Unesite naziv proizvoda: ");
                String naziv = scanner.nextLine();

                System.out.println("Unesite cijenu proizvoda: ");
                double cijena = scanner.nextDouble();

                System.out.println("Unesite kolicinu proizvoda: ");
                int kolicina = scanner.nextInt();

                return new Proizvod(naziv, cijena, kolicina);

            } catch (InputMismatchException e) {
                System.out.println("Pokušajte ponovo.");
                scanner.nextLine();

            } catch (Exception e) {
                System.out.println("Došlo je do greške: " + e.getMessage());
            }
        }

    }

    public static void zapisivanjeProizvodaUDatoteke(List<Proizvod> proizvodi, File outputFileProizvodi, File outputFileSkupljiProizvodi) {
        try (
                BufferedWriter writerProizvod = new BufferedWriter(new FileWriter(outputFileProizvodi));
                BufferedWriter writerSkupljiProizvod = new BufferedWriter(new FileWriter(outputFileSkupljiProizvodi))
        ) {
            writerProizvod.write("Popis proizvoda:\n");
            writerProizvod.write("================\n");

            writerSkupljiProizvod.write("Popis skupljih proizvoda od 50 :\n");
            writerSkupljiProizvod.write("===============================\n");

            for (Proizvod proizvod : proizvodi) {
                writerProizvod.write(proizvod.toString() + "\n");
                writerProizvod.write("-----------------\n");

                if (proizvod.getCijena() > 50) {
                    writerSkupljiProizvod.write(proizvod.toString() + "\n");
                    writerSkupljiProizvod.write("-----------------\n");
                }
            }

            System.out.println("\nProizvodi su zapisani u datoteke.");
        } catch (IOException e) {
            System.out.println("Došlo je do greške pri pisanju u datoteke: " + e.getMessage());
        }
    }


}
