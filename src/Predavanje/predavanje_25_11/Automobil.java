package Predavanje.predavanje_25_11;

public class Automobil extends Vozilo {

    private int brojSjedala;
    private String vrstaGoriva;


    public Automobil(String marka, String model, String registracija, int brojSjedala, String vrstaGoriva) {
        super(marka, model, registracija);
        this.brojSjedala = brojSjedala;
        setVrstaGoriva(vrstaGoriva);
    }

    @Override
    String detaljanOpisVozila() {
        return "Automobil {" +
                "brojSjedala=" + brojSjedala +
                ", vrstaGoriva='" + vrstaGoriva + '\'' +
                "} " + super.toString();
    }

    public int getBrojSjedala() {
        return brojSjedala;
    }

    public void setBrojSjedala(int brojSjedala) {
        this.brojSjedala = brojSjedala;
    }

    public String getVrstaGoriva() {
        return vrstaGoriva;
    }

    public void setVrstaGoriva(String vrstaGoriva) {

        if (!vrstaGoriva.equals("dizel") && !vrstaGoriva.equals("benzin")) {
            throw new RuntimeException("vrsta goriva nije dizel ili benzin");
        }

        this.vrstaGoriva = vrstaGoriva;
    }

}
