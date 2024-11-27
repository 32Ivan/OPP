package PARCIJALNI.parcijalni_27_11;

public class Vozilo {

    private String registracijskiBroj;
    private String marka;
    private int godina;

    public Vozilo(String registracijskiBroj, String marka, int godina) {
        this.registracijskiBroj = registracijskiBroj;
        this.marka = marka;
        setGodina(godina);
    }

    public String getRegistracijskiBroj() {
        return registracijskiBroj;
    }

    public void setRegistracijskiBroj(String registracijskiBroj) {
        this.registracijskiBroj = registracijskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        if (godina < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivan broj");
        }
        this.godina = godina;
    }

    public String prikazPodataka() {
        return "Vozilo{" +
                "registracijskiBroj='" + registracijskiBroj + '\'' +
                ", marka='" + marka + '\'' +
                ", godina=" + godina;
    }

}
