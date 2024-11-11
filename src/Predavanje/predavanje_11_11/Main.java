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
                    karticnoPlacanje();
                    break;
                case 2:
                    gotovinskoPlacanje();
                    break;
                case 3:
                    payPalPlacanje();
                    break;
                default:
                    System.out.println("Pogresan unos pokusaj ponovo");

            }


        } while (true);

    }

    public static void karticnoPlacanje() {
        Placanje kreditnaKartica = new KreditnaKartica();
        System.out.println("Unesite iznos uplate :");
        double iznos = scanner.nextDouble();
        kreditnaKartica.platiti(iznos);
        System.out.println(kreditnaKartica.getDetalje());
        System.out.println(kreditnaKartica.vratiIznos());

    }

    public static void gotovinskoPlacanje() {
        Placanje gotovina = new Gotovina();
        System.out.println("Unesite iznos uplate :");
        double iznos = scanner.nextDouble();
        gotovina.platiti(iznos);
        System.out.println(gotovina.getDetalje());
        System.out.println(gotovina.vratiIznos());

    }

    public static void payPalPlacanje() {
        Placanje payPal = new PayPal();
        System.out.println("Unesite iznos uplate :");
        double iznos = scanner.nextDouble();
        payPal.platiti(iznos);
        System.out.println(payPal.getDetalje());
        System.out.println(payPal.vratiIznos());

    }
}
