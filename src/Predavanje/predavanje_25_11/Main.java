package Predavanje.predavanje_25_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        List<Vozilo> vozniPark = new ArrayList<>();

        vozniPark.add(new Automobil("vw", "golf", "da12123fds", 5, "dizel"));
        vozniPark.add(new Automobil("mazda", "3", "dao1213fds", 5, "dizel"));
        vozniPark.add(new Automobil("opel", "corsa", "dao123fdas", 5, "dizel"));
        vozniPark.add(new Automobil("suzuki", "swift", "d1afsd2123fdas", 5, "dizel"));
        vozniPark.add(new Kamion("mercedes", "actros", "dao12fdas3fdas", 5.2, true));
        vozniPark.add(new Kamion("scania", "r500", "d12123fdfdasas", 5.1, false));

        System.out.println(pretrazivanjeVozilaPoRegistraciji(vozniPark));

        System.out.println("Ako zelis ispis svih vozila u voznom parku unesi 1 ako zelis prekinuti program unesi 2");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                ispisSvihVozila(vozniPark);
                break;
            case 2:
                System.out.println("Program je prekinut");
                break;
            default:
                System.out.println("Unjeli ste krivi unos program je prekinut");
                break;

        }


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
}
