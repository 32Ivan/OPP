package Predavanje.predavanje_21_11;

public class Zaposlenik {
    private String ime;
    private String prezime;
    private double placa;

    public Zaposlenik(String ime, String prezime, double placa) {
        this.ime = ime;
        this.prezime = prezime;
        this.placa = placa;
    }

    public Zaposlenik() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Zaposlenik " +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", placa=" + placa;
    }
}
