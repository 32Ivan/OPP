package Predavanje.predavanje_11_11;

public class Main {
    public static void main(String[] args) {

        Placanje kreditnaKartica = new KreditnaKartica();
        Placanje gotovina = new Gotovina();
        Placanje payPal = new PayPal();

        kreditnaKartica.platiti(100);
        gotovina.platiti(110);
        payPal.platiti(120);

        System.out.println(kreditnaKartica.getDetalje());
        System.out.println(gotovina.getDetalje());
        System.out.println(payPal.getDetalje());

        System.out.println(kreditnaKartica.vratiIznos());
        System.out.println(gotovina.vratiIznos());
        System.out.println(payPal.vratiIznos());

    }
}
