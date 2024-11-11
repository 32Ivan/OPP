package Predavanje.predavanje_11_11;

public class Gotovina implements Placanje {
    private double iznos;

    @Override
    public void platiti(double iznos) {
        if (iznos < 0) {
            this.iznos = 0.0d;
        }
        this.iznos = iznos;
    }

    @Override
    public String getDetalje() {
        return "Placanje u gotovini u iznosu od : " + iznos + " EUR";
    }

    @Override
    public double vratiIznos() {
        return this.iznos;
    }
}