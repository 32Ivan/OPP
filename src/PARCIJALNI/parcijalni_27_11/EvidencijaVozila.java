package PARCIJALNI.parcijalni_27_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {

    private List<Vozilo> listaVozila;

    public EvidencijaVozila() {
        this.listaVozila = new ArrayList<>();
    }

    public List<Vozilo> getListaVozila() {
        return this.listaVozila;
    }

    public void dodajNovoVoziloUListu(Vozilo vozilo) {
        this.listaVozila.add(vozilo);
    }

    public void spremiPodatkeUDatoteku(String datoteka) throws IOException {

        FileWriter fileWriter = new FileWriter(datoteka);

        for (Vozilo vozilo : listaVozila) {
            fileWriter.write(vozilo.prikazPodataka());
            fileWriter.write("\n");
        }

        fileWriter.close();
        System.out.println("Podaci su spremljeni");

    }

    public void ucitajPodatkeIzDatoteke(String datoteka) throws IOException {
        FileReader fileReader = new FileReader(datoteka);
        BufferedReader reader = new BufferedReader(fileReader);
        String linija;
        System.out.println("Podaci iz datoteke:");

        while ((linija = reader.readLine()) != null) {
            System.out.println(linija);
        }

    }

}
