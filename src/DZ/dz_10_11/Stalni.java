package DZ.dz_10_11;

import java.math.BigDecimal;

public class Stalni extends Zaposlenik {

    public Stalni(String ime, BigDecimal placa, Double brojRadnihSati) {
        super(ime, placa, brojRadnihSati);
    }

    @Override
    public BigDecimal izracunPlace() {

        if (getBrojRadnihSati() > 160) {
            BigDecimal bonus = getPlaca().multiply(BigDecimal.valueOf(0.15));
            setPlaca(getPlaca().add(bonus));

        }

        return getPlaca();
    }
}
