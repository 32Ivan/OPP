package Predavanje.predavanje_25_11;

public abstract class Vozilo {


    private String marka;
    private String model;
    private String registracija;

    public Vozilo(String marka, String model, String registracija) {
        this.marka = marka;
        this.model = model;
        this.registracija = registracija;
    }


    abstract String detaljanOpisVozila();


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    @Override
    public String toString() {
        return "Vozilo {" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", registracija='" + registracija + '\'' +
                '}';
    }
}
