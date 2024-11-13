package DZ.dz_13_11;

import java.time.Year;

public class Roman implements Knjiga {

    private String naslov;
    private String autor;
    private Integer godinaIzdavanja;
    private Integer brojStranica;
    private String stanjeKnjige;

    public Roman(String naslov, String autor, Integer godinaIzdavanja, Integer brojStranica) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdavanja = (godinaIzdavanja >= 1900 && godinaIzdavanja <= Year.now().getValue()) ? godinaIzdavanja : 1900;
        this.brojStranica = brojStranica > 0 ? brojStranica : 0;
        this.stanjeKnjige = "Dostupno";
    }

    @Override
    public String getNaslov() {
        return this.naslov;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public int getGodinaIzdavanja() {
        return this.godinaIzdavanja;
    }

    @Override
    public int getBrojStranica() {
        return this.brojStranica;
    }

    @Override
    public String getStanje() {
        return this.stanjeKnjige;
    }

    @Override
    public boolean posudi() {
        if (this.stanjeKnjige.equals("Dostupno")) {
            this.stanjeKnjige = "Posuđeno";
            return true;
        }
        return false;
    }

    @Override
    public boolean vrati() {
        if (this.stanjeKnjige.equals("Posuđeno")) {
            this.stanjeKnjige = "Dostupno";
            return true;
        }
        return false;
    }
}
