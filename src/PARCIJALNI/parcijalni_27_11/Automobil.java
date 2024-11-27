package PARCIJALNI.parcijalni_27_11;


public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String registracijskiBroj, String marka, int godina, int brojVrata) {
        super(registracijskiBroj, marka, godina);
        setBrojVrata(brojVrata);
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan broj");
        }
        this.brojVrata = brojVrata;
    }


    @Override
    public String prikazPodataka() {
        return "Automobil " +
                "brojVrata= " + brojVrata +
                " " + super.prikazPodataka();
    }

}
