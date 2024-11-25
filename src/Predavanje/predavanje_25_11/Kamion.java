package Predavanje.predavanje_25_11;

public class Kamion extends Vozilo {

    private double nosivost;
    private boolean prikolica;

    public Kamion(String marka, String model, String registracija, double nosivost, boolean prikolica) {
        super(marka, model, registracija);
        this.nosivost = nosivost;
        this.prikolica = prikolica;
    }

    @Override
    String detaljanOpisVozila() {
        return "Kamion {" +
                "nosivost=" + nosivost +
                ", prikolica=" + prikolica +
                "} " + super.toString();
    }

    public double getNosivost() {
        return nosivost;
    }

    public void setNosivost(double nosivost) {
        this.nosivost = nosivost;
    }

    public boolean isPrikolica() {
        return prikolica;
    }

    public void setPrikolica(boolean prikolica) {
        this.prikolica = prikolica;
    }

}
