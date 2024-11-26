package DZ.dz_26_11;

import java.util.ArrayList;
import java.util.List;

public class Knjiznica implements RadSaKnjigama {

    private List<Osoba> clanoviKnjiznice;
    private List<Knjiga> listaKnjiga;

    public Knjiznica() {
        this.clanoviKnjiznice = new ArrayList<>();
        this.listaKnjiga = new ArrayList<>();
    }


    public List<Osoba> getClanoviKnjiznice() {
        return clanoviKnjiznice;
    }

    public void ukloniClanaIzKnjiznice(int brojClanskeIskaznice) {
        for (int i = 0; i < clanoviKnjiznice.size(); i++) {

            if (brojClanskeIskaznice == clanoviKnjiznice.get(i).getClanskiBroj()) {
                clanoviKnjiznice.remove(i);
                System.out.println("Osoba " + clanoviKnjiznice.get(i) + " je uklonjena iz knjiznice");
            }
        }
    }


    public void dodajNovogClanaUKnjiznicu(Osoba osoba) {
        if (osoba.getIme().isBlank()) {
            System.out.println("Svaki clan mora imati ime i prezime");
        } else if (osoba.getPrezime().isBlank()) {
            System.out.println("Svaki clan mora imati ime i prezime");
        } else {
            this.clanoviKnjiznice.add(osoba);
            System.out.println("Novi clan je dodan u knjiznicu broj clanske iskaznice je " + osoba.getClanskiBroj());
        }


    }

    public void ukloniKnjiguIzKnjiznice(String imeKnjige, String autorKnjige) {
        for (int i = 0; i < listaKnjiga.size(); i++) {
            {
                if (listaKnjiga.get(i).getImeKnjige().equals(imeKnjige) && listaKnjiga.get(i).getAutorKnjige().equals(autorKnjige)) {
                    System.out.println("Knjiga " + listaKnjiga.get(i) + " je uklonjena iz knjiznice");
                    listaKnjiga.remove(i);
                }
            }
        }
    }

    public void dodajNovuKnjiguUKnjiznicu(Knjiga knjiga) {
        boolean status = false;
        for (Knjiga knjigaIzListe : listaKnjiga) {
            if (knjigaIzListe.getImeKnjige().equals(knjiga.getImeKnjige())
                    && knjigaIzListe.getAutorKnjige().equals(knjiga.getAutorKnjige())) {
                status = true;
            }
        }
        if (!status) {

            if (knjiga.getImeKnjige().isBlank()) {
                System.out.println("Knjiga mora imati ime i autora");
            } else if (knjiga.getAutorKnjige().isBlank()) {
                System.out.println("Knjiga mora imati ime i autora");
            } else {
                this.listaKnjiga.add(knjiga);
                System.out.println("Knjiga je dodana u knjiznicu");
            }
        } else {
            System.out.println("Vec postoji ta knjiga u knjiznici");
        }
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }


    @Override
    public boolean vracenaKnjiga(Knjiga knjiga) {
        boolean status = false;
        for (Knjiga knjigaIzListe : this.listaKnjiga) {
            if (knjigaIzListe.getImeKnjige().equals(knjiga.getImeKnjige())
                    && knjigaIzListe.getAutorKnjige().equals(knjiga.getAutorKnjige())
                    && !knjigaIzListe.isDostupna()
            ) {
                knjigaIzListe.setDostupna(true);
                status = true;
            }
        }
        return status;
    }

    @Override
    public boolean izdanaKnjiga(Knjiga knjiga) {
        boolean status = true;
        for (Knjiga knjigaIzListe : this.listaKnjiga) {
            if (knjigaIzListe.getImeKnjige().equals(knjiga.getImeKnjige())
                    && knjigaIzListe.getAutorKnjige().equals(knjiga.getAutorKnjige())
                    && knjigaIzListe.isDostupna()
            ) {
                knjigaIzListe.setDostupna(false);
                status = false;
            }
        }
        return status;
    }
}
