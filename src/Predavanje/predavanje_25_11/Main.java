package Predavanje.predavanje_25_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        List<Vozilo> vozniPark = new ArrayList<>();

        do {


            System.out.println("Ako zelis unjeti novi Kamion na listu voznog parka unesi 1");
            System.out.println("Ako zelis unjeti novi Automobil na listu voznog parka unesi 2");
            System.out.println("Ako zelis pronoaci vozilo preko registracije unesi 3");
            System.out.println("Ako zelis ispisati sva vozila unesi 4");
            System.out.println("Ako zelis izaci iz unosa neki drugi broj");
            int number = scanner.nextInt();

            scanner.nextLine();
            switch (number) {
                case 1:
                    Kamion noviKamion = dodajNoviKamionUListuVozila();
                    boolean provjeraKamiona = provjeraJedinstvenostiRegisrtracije(vozniPark, noviKamion);
                    if (provjeraKamiona) {
                        System.out.println("Vozilo sa registracijom " + noviKamion.getRegistracija() + " vec postoji u listi stoga nece biti dodano");
                    } else {
                        vozniPark.add(noviKamion);
                    }
                    break;
                case 2:
                    Automobil noviAutomobil = dodajNoviAutomobilUListuVozila();
                    boolean provjeraAutomobila = provjeraJedinstvenostiRegisrtracije(vozniPark, noviAutomobil);
                    if (provjeraAutomobila) {
                        System.out.println("Vozilo sa registracijom " + noviAutomobil.getRegistracija() + " vec postoji u listi stoga nece biti dodano");
                    } else {
                        vozniPark.add(noviAutomobil);
                    }
                    break;
                case 3:
                    System.out.println(pretrazivanjeVozilaPoRegistraciji(vozniPark));

                    break;
                case 4:
                    ispisSvihVozila(vozniPark);
                    break;
                default:
                    System.out.println("Izasli ste iz programa");
                    return;


            }

        } while (true);


    }

    public static String pretrazivanjeVozilaPoRegistraciji(List<Vozilo> vozila) {
        try {
            System.out.println("Unseite registracije od vozila koje pokusavate pronaci");

            String registracija = scanner.nextLine();


            for (Vozilo vozilo : vozila) {
                if (vozilo.getRegistracija().equals(registracija)) {
                    return vozilo.detaljanOpisVozila();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return "Vozilo ne postoji sa tom registracijom";
    }

    public static void ispisSvihVozila(List<Vozilo> vozilos) {
        for (Vozilo vozilo : vozilos) {
            System.out.println(vozilo.detaljanOpisVozila());
        }
    }

    private static Kamion dodajNoviKamionUListuVozila() {
        System.out.println("Unos Kamiona");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite podatke za novo vozilo (marka, model, registracija, itd.):");

        System.out.print("Marka: ");
        String marka = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Registracija: ");
        String registracija = scanner.nextLine();

        System.out.print("Nosivost : ");
        double nosivost = scanner.nextDouble();

        System.out.print("Prikolica (true ili false): ");
        boolean prikolica = scanner.hasNextBoolean();


        return new Kamion(marka, model, registracija, nosivost, prikolica);
    }

    private static Automobil dodajNoviAutomobilUListuVozila() {
        System.out.println("Unos Automobila");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite podatke za novo vozilo (marka, model, registracija, itd.):");

        System.out.print("Marka: ");
        String marka = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Registracija: ");
        String registracija = scanner.nextLine();

        System.out.print("Broj sjedala : ");
        int brojSjedala = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Vrsta goriva: ");
        String vrstaGoriva = scanner.nextLine();

        if (!vrstaGoriva.equalsIgnoreCase("dizel") && !vrstaGoriva.equalsIgnoreCase("benzin")) {
            throw new RuntimeException("Vrsta goriva nije dizel ili benzin");
        }

        return new Automobil(marka, model, registracija, brojSjedala, vrstaGoriva);
    }

    public static boolean provjeraJedinstvenostiRegisrtracije(List<Vozilo> listist, Vozilo novoVozilo) {
        boolean postojanjeVozilaUListi = false;
        for (Vozilo vozila : listist) {
            if (vozila.getRegistracija().equals(novoVozilo.getRegistracija())) {
                postojanjeVozilaUListi = true;
            }
        }
        return postojanjeVozilaUListi;
    }
}
