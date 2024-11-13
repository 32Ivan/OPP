package DZ.dz_13_11;

public interface Knjiga {
    
    String getNaslov(); // vraća naslov knjige

    String getAutor(); //vraća autora knjige

    int getGodinaIzdavanja(); //vraća godinu izdavanja knjige

    int getBrojStranica(); //vraća broj stranica knjige

    String getStanje(); //vraća stanje knjige (npr. "Dostupno" ili "Posuđeno")

    boolean posudi(); // označava knjigu kao posuđenu

    boolean vrati(); //označava knjigu kao dostupnu
}
