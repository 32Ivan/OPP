package PARCIJALNI.parcijalni_27_11;

public class Motocikl extends Vozilo {

    private String tipMotora;


    public Motocikl(String registracijskiBroj, String marka, int godina, String tipMotora) {
        super(registracijskiBroj, marka, godina);
        setTipMotora(tipMotora);
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        if (tipMotora.equalsIgnoreCase("benzinski")
                || tipMotora.equalsIgnoreCase("elektricni")) {
            this.tipMotora = tipMotora;
        } else {
            throw new NeispravniPodaciException("Tip motora moze biti benzinski ili elektricni");

        }
    }

    @Override
    public String prikazPodataka() {
        return "Motocikl " +
                "tipMotora='" + tipMotora + '\'' +
                " " + super.prikazPodataka();
    }

}
