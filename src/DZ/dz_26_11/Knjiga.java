package DZ.dz_26_11;

public class Knjiga {
    private String imeKnjige;
    private String autorKnjige;
    private boolean dostupna;

    public Knjiga(String imeKnjige, String autorKnjige) {
        this.imeKnjige = imeKnjige;
        this.autorKnjige = autorKnjige;
        this.dostupna = true;
    }

    public String getImeKnjige() {
        return imeKnjige;
    }

    public void setImeKnjige(String imeKnjige) {
        this.imeKnjige = imeKnjige;
    }

    public String getAutorKnjige() {
        return autorKnjige;
    }

    public void setAutorKnjige(String autorKnjige) {
        this.autorKnjige = autorKnjige;
    }

    public boolean isDostupna() {
        return dostupna;
    }

    public void setDostupna(boolean dostupna) {
        this.dostupna = dostupna;
    }

    @Override
    public String toString() {
        return "Knjiga " +
                "imeKnjige='" + imeKnjige + '\'' +
                ", autorKnjige='" + autorKnjige + '\'' +
                ", dostupna=" + dostupna;
    }
}
