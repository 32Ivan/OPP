package Predavanje.predavanje_11_11;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int number;

        do {
            System.out.println("Odaberi nacin placanja 1 za gotovinsko ,2 za karticno ,3 za PayPal i za prekid odaberi 4");

            number = scanner.nextInt();

            if (number == 4) {
                break;
            }

            switch (number) {
                case 1:
                    nacinPlacanja(new Gotovina());
                    break;
                case 2:
                    nacinPlacanja(new KreditnaKartica());
                    break;
                case 3:
                    nacinPlacanja(new PayPal());
                    break;
                default:
                    System.out.println("Pogresan unos pokusaj ponovo");

            }


        } while (true);

    }

    public static void nacinPlacanja(Placanje placanje) {
        System.out.println("Unesite iznos uplate:");
        double iznos = scanner.nextDouble();
        placanje.platiti(iznos);
        System.out.println(placanje.getDetalje());
    }

}
