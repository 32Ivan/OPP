package DZ.dz_10_11;

import java.math.BigDecimal;

public abstract class Zaposlenik {

    private String ime;
    private BigDecimal placa;
    private Double brojRadnihSati;


    public Zaposlenik(String ime, BigDecimal placa, Double brojRadnihSati) {
        this.ime = ime;
        this.placa = placa;
        this.brojRadnihSati = brojRadnihSati;
    }

    public abstract BigDecimal izracunPlace();

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public BigDecimal getPlaca() {
        return placa;
    }

    public void setPlaca(BigDecimal placa) {
        this.placa = placa;
    }

    public Double getBrojRadnihSati() {
        return brojRadnihSati;
    }

    public void setBrojRadnihSati(Double brojRadnihSati) {
        this.brojRadnihSati = brojRadnihSati;
    }

    @Override
    public String toString() {
        return "Zaposlenik " +
                "ime='" + ime + '\'' +
                ", placa=" + placa +
                ", brojRadnihSati=" + brojRadnihSati +
                ' ';
    }
}
