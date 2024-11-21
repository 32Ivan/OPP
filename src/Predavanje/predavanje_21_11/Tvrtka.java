package Predavanje.predavanje_21_11;

import java.util.List;

public class Tvrtka {
    private String tvrtka;

    private List<Zaposlenik> zaposlenici;

    public Tvrtka(String tvrtka, List<Zaposlenik> zaposlenici) {
        this.tvrtka = tvrtka;
        this.zaposlenici = zaposlenici;
    }

    public void dodajZaposlenika(Zaposlenik zaposlenik) {
        this.zaposlenici.add(zaposlenik);
        System.out.print("Zaposlenik je dodan u listu");
    }

    public void ispisZaposlenika() {
        System.out.println("Ispis svih zaposlenika : ");
        for (Zaposlenik zaposlenik : this.zaposlenici) {
            System.out.println(zaposlenik.toString());
        }
    }

    public Zaposlenik pronadjiNajvecuPlacu() {

        if (this.zaposlenici.isEmpty()) {
            System.out.println("Lista zaposlenici je prazna.");
            throw new RuntimeException("Lista zaposlenici je prazna");
        }

        Zaposlenik zaposlenikSaNajvecomPlacom = this.zaposlenici.get(0);

        for (int i = 0; i < this.zaposlenici.size(); i++) {
            if (this.zaposlenici.get(i).getPlaca() > zaposlenikSaNajvecomPlacom.getPlaca()) {
                zaposlenikSaNajvecomPlacom = this.zaposlenici.get(i);
            }
        }
        return zaposlenikSaNajvecomPlacom;
    }

}
