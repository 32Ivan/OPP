package DZ.dz_13_11.abst;

import java.time.Year;

public abstract class Knjiga {

    private String naslov;
    private String autor;
    private Integer godinaIzdavanja;
    private Integer brojStranica;
    private String stanjeKnjige;

    public Knjiga(String naslov, String autor, Integer godinaIzdavanja, Integer brojStranica) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdavanja = (godinaIzdavanja >= 1900 && godinaIzdavanja <= Year.now().getValue()) ? godinaIzdavanja : 1900;
        this.brojStranica = brojStranica > 0 ? brojStranica : 0;
        this.stanjeKnjige = "Dostupno";
    }

    public String getNaslov() {
        return this.naslov;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getGodinaIzdavanja() {
        return this.godinaIzdavanja;
    }

    public int getBrojStranica() {
        return this.brojStranica;
    }

    public String getStanje() {
        return this.stanjeKnjige;
    }

    public boolean posudi() {
        if (this.stanjeKnjige.equals("Dostupno")) {
            this.stanjeKnjige = "Posuđeno";
            return true;
        }
        return false;
    }


    public boolean vrati() {
        if (this.stanjeKnjige.equals("Posuđeno")) {
            this.stanjeKnjige = "Dostupno";
            return true;
        }
        return false;
    }
}
