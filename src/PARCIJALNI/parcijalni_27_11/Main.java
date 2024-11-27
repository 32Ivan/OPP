package PARCIJALNI.parcijalni_27_11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "src/PARCIJALNI/parcijalni_27_11/podatci_o_vozilima.txt";
        EvidencijaVozila evidencijaVozila = new EvidencijaVozila();

        Motocikl honda = new Motocikl("ho22", "honda", 2021, "benzinski");
        evidencijaVozila.dodajNovoVoziloUListu(honda);

        Motocikl aprilia = new Motocikl("ap33", "aprilia", 2002, "benzinski");
        evidencijaVozila.dodajNovoVoziloUListu(aprilia);

        Motocikl yamaha = new Motocikl("ya55", "yamaha", 2012, "benzinski");
        evidencijaVozila.dodajNovoVoziloUListu(yamaha);

        Automobil vw = new Automobil("vw21", "vw", 22, 5);
        evidencijaVozila.dodajNovoVoziloUListu(vw);

        Automobil opel = new Automobil("op31", "opel", 22, 5);
        evidencijaVozila.dodajNovoVoziloUListu(opel);

        Automobil mazda = new Automobil("ma42", "mazda", 22, 5);
        evidencijaVozila.dodajNovoVoziloUListu(mazda);


        for (int i = 0; i < evidencijaVozila.getListaVozila().size(); i++) {
            System.out.println(evidencijaVozila.getListaVozila().get(i).prikazPodataka());
        }

        evidencijaVozila.spremiPodatkeUDatoteku(file);

        evidencijaVozila.ucitajPodatkeIzDatoteke(file);

    }
}
