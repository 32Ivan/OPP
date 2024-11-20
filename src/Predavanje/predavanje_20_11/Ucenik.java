package Predavanje.predavanje_20_11;

public class Ucenik {

    private String ime;
    private String prezime;
    private Double prosjekOcjena;

    public Ucenik(String ime, String prezime, Double prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.prosjekOcjena = prosjekOcjena;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Double getProsjekOcjena() {
        return prosjekOcjena;
    }

    public void setProsjekOcjena(Double prosjekOcjena) {
        this.prosjekOcjena = prosjekOcjena;
    }

    @Override
    public String toString() {
        return "Zovem se: " + this.ime + " " + this.prezime + " prosjek ocjena mi je " + this.prosjekOcjena;
    }

    public void ispisiInfo() {
        System.out.println("Zovem se: " + this.ime + " " + this.prezime + " prosjek ocjena mi je " + this.prosjekOcjena);
    }
    
}
