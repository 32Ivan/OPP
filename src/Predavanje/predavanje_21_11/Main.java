package Predavanje.predavanje_21_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            System.out.println("Odaberi koliko zaposlenika zelis dodati (broj ne moze biti manji od 3)");

            List<Zaposlenik> zaposlenici = new ArrayList<>();

            int num = scanner.nextInt();
            scanner.nextLine();
            if (num < 3) {
                throw new NumberException("Broj je manji od 3");
            }

            System.out.println("Unesi ime tvrtke");

            String imeTvrtke = scanner.nextLine();
            if (imeTvrtke.isBlank()) {
                throw new StringException("Ime tvrtke ne moze biti prazno");
            }
            Tvrtka tvrtka = new Tvrtka(imeTvrtke, zaposlenici);

            while (num > 0) {
                try {
                    zaposlenici.add(kreiranjeNovogZaposlenika());
                    num--;
                    scanner.nextLine();
                } catch (StringException | NumberException e) {
                    System.out.println(e.getMessage());
                }
            }
            tvrtka.ispisZaposlenika();
            System.out.println("Zaposlenik sa najvecom placom je : " + tvrtka.pronadjiNajvecuPlacu());
        } catch (NumberException | StringException e) {
            System.out.println(e.getMessage());
        }


    }


    static Zaposlenik kreiranjeNovogZaposlenika() {
        System.out.println("Unesite ime za novog zaposlenika ");
        String ime = scanner.nextLine();
        if (ime.isBlank()) {
            throw new StringException("Ime ne moze biti prazno");
        }

        System.out.println("Unesite prezime za novog zaposlenika");
        String prezime = scanner.nextLine();
        if (prezime.isBlank()) {
            throw new StringException("Prezime ne moze biti prazno");
        }
        System.out.println("Unesite placu za novog zaposlenika");

        double placa = scanner.nextDouble();
        if (placa < 0) {
            throw new NumberException("Placa mora biti veca od 0");
        }
        return new Zaposlenik(ime, prezime, placa);
    }

}
