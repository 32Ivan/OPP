package DZ.dz_10_11;

import java.math.BigDecimal;

public class Sezonski extends Zaposlenik {

    public Sezonski(String ime, BigDecimal placa, Double brojRadnihSati) {
        super(ime, placa, brojRadnihSati);
    }

    @Override
    public BigDecimal izracunPlace() {

        if (getBrojRadnihSati() > 200) {
            BigDecimal bonus = getPlaca().multiply(BigDecimal.valueOf(0.10));
            setPlaca(getPlaca().add(bonus));

        }
        return getPlaca();
    }
}
