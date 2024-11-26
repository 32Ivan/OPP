package DZ.dz_26_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Osoba implements RadSaKnjigama {
    private String ime;
    private String prezime;
    private int clanskiBroj;
    private List<Knjiga> listaKnjiga;


    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        Random rnd = new Random();
        this.clanskiBroj = 100000 + rnd.nextInt(900000);
        this.listaKnjiga = new ArrayList<>();

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

    public int getClanskiBroj() {
        return clanskiBroj;
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }


    @Override
    public String toString() {
        return "Osoba " +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", clanskiBroj=  " + clanskiBroj;
    }

    @Override
    public boolean vracenaKnjiga(Knjiga knjiga) {
        boolean status = false;
        if (listaKnjiga.contains(knjiga)) {
            listaKnjiga.remove(knjiga);
            status = true;
            System.out.println("Knjiga " + knjiga.getImeKnjige() + " je vraćena knjiznici.");
        }

        return status;
    }

    @Override
    public boolean izdanaKnjiga(Knjiga knjiga) {
        boolean status = false;
        if (!listaKnjiga.contains(knjiga)) {
            listaKnjiga.add(knjiga);
            status = true;
            System.out.println("Knjiga " + knjiga.getImeKnjige() + " je izdana korisniku.");
        }
        return status;
    }
}
