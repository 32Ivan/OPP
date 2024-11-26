package DZ.dz_26_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Knjiznica knjiznica = new Knjiznica();

    public static void main(String[] args) throws IOException {


        while (true) {
            System.out.println("Odaberite opciju:");
            System.out.println("1. Dodaj novog člana");
            System.out.println("2. Dodaj novu knjigu");
            System.out.println("3. Posudi knjigu");
            System.out.println("4. Vrati knjigu");
            System.out.println("5. Ispis clanove knjiznice");
            System.out.println("6. Ispis knjiga u knjiznici");
            System.out.println("7. Izlaz");
            System.out.println("8. Ispis podataka o tvrtki u tvrtka.txt");
            System.out.println("9. Ispis podataka o clanovima u clanovi.txt");

            int opcija = scanner.nextInt();
            scanner.nextLine();

            switch (opcija) {
                case 1:
                    unesiNovogClana();
                    break;
                case 2:
                    unesiNovuKnjigu();
                    break;
                case 3:
                    System.out.println("Unesi clanski broj:");
                    int clanskiBroj = scanner.nextInt();
                    scanner.nextLine();
                    Osoba korisnik = pronadjiClana(knjiznica, clanskiBroj);
                    if (korisnik == null) {
                        System.out.println("Clan nije pronaden");
                        break;
                    }

                    System.out.println("Unesi naziv knjige koju zelis posuditi:");
                    String imeKnjige = scanner.nextLine();
                    System.out.println("Unesi autora knjige:");
                    String autorKnjige = scanner.nextLine();

                    Knjiga knjigaZaPosuditi = pronadjiKnjiguUKnjiznici(knjiznica, imeKnjige, autorKnjige);
                    if (knjigaZaPosuditi == null) {
                        System.out.println("Knjiga nije pronadena.");
                    } else {
                        if (!knjiznica.izdanaKnjiga(knjigaZaPosuditi)) {
                            korisnik.izdanaKnjiga(knjigaZaPosuditi);
                            System.out.println("Knjiga " + knjigaZaPosuditi.getImeKnjige() + " je posudena.");
                        } else {
                            System.out.println("Knjiga nije dostupna.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Unesi clanski broj:");
                    clanskiBroj = scanner.nextInt();
                    scanner.nextLine();
                    korisnik = pronadjiClana(knjiznica, clanskiBroj);
                    if (korisnik == null) {
                        System.out.println("Clan nije pronaden");
                        break;
                    }

                    System.out.println("Unesite naziv knjige koju vracate:");
                    imeKnjige = scanner.nextLine();
                    System.out.println("Unesite autora knjige:");
                    autorKnjige = scanner.nextLine();

                    Knjiga knjigaZaVratiti = pronadjiKnjiguKodOsobe(korisnik, imeKnjige, autorKnjige);
                    if (knjigaZaVratiti == null) {
                        System.out.println("Knjiga nije pronadena");
                    } else {
                        if (knjiznica.vracenaKnjiga(knjigaZaVratiti)) {
                            korisnik.vracenaKnjiga(knjigaZaVratiti);
                            System.out.println("Knjiga " + knjigaZaVratiti.getImeKnjige() + " je vracena.");
                        } else {
                            System.out.println("Knjiga nije vraćena.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Clanovi knjiznice:");
                    for (Osoba clan : knjiznica.getClanoviKnjiznice()) {
                        System.out.println(clan.toString());
                    }
                    break;
                case 6:
                    System.out.println("Knjige u knjiznici:");
                    for (Knjiga knjiga : knjiznica.getListaKnjiga()) {
                        System.out.println(knjiga.toString());
                    }
                    break;
                case 7:
                    System.out.println("Izlaz iz programa.");
                    return;
                case 8:
                    ispisPodatakaOTvrtki();
                    break;
                case 9:
                    ispisPodatakaOClanovima();
                    break;
                default:
                    System.out.println("Pokusaj ponovo krivi unos");
            }
        }


    }

    public static void ispisPodatakaOTvrtki() throws IOException {
        File tvrtkaFile = new File("src/DZ/dz_26_11/tvrtka.txt");
        FileWriter tvrtkaFileZapis = new FileWriter(tvrtkaFile);
        tvrtkaFileZapis.write("Informacije o knjigama:\n");
        for (Knjiga knjiga : knjiznica.getListaKnjiga()) {
            tvrtkaFileZapis.write(knjiga.toString());
        }
        tvrtkaFileZapis.close();

    }

    public static void ispisPodatakaOClanovima() throws IOException {
        File clanoviFile = new File("src/DZ/dz_26_11/clanovi.txt");

        FileWriter clanoviFileZapis = new FileWriter(clanoviFile);
        clanoviFileZapis.write("Informacije o clanovima:\n");
        for (Osoba osoba : knjiznica.getClanoviKnjiznice()) {
            clanoviFileZapis.write(osoba.toString());
        }
        clanoviFileZapis.close();

    }

    public static void unesiNovogClana() {
        System.out.println("Unesite ime:");
        String imeClana = scanner.nextLine();
        System.out.println("Unesite prezime:");
        String prezimeClana = scanner.nextLine();
        Osoba noviClan = new Osoba(imeClana, prezimeClana);
        knjiznica.dodajNovogClanaUKnjiznicu(noviClan);
    }

    public static void unesiNovuKnjigu() {
        System.out.println("Unesite naziv knjige:");
        String nazivKnjige = scanner.nextLine();
        System.out.println("Unesite autora knjige:");
        String autorKnjigeZaDodati = scanner.nextLine();
        Knjiga novaKnjiga = new Knjiga(nazivKnjige, autorKnjigeZaDodati);
        knjiznica.dodajNovuKnjiguUKnjiznicu(novaKnjiga);
    }

    public static Osoba pronadjiClana(Knjiznica knjiznica, int clanskiBroj) {
        for (Osoba osoba : knjiznica.getClanoviKnjiznice()) {
            if (osoba.getClanskiBroj() == clanskiBroj) {
                return osoba;
            }
        }
        return null;
    }

    public static Knjiga pronadjiKnjiguUKnjiznici(Knjiznica knjiznica, String ime, String autor) {
        for (Knjiga knjiga : knjiznica.getListaKnjiga()) {
            if (knjiga.getImeKnjige().equals(ime) && knjiga.getAutorKnjige().equals(autor)) {
                return knjiga;
            }
        }
        return null;
    }

    public static Knjiga pronadjiKnjiguKodOsobe(Osoba korisnik, String ime, String autor) {
        for (Knjiga knjiga : korisnik.getListaKnjiga()) {
            if (knjiga.getImeKnjige().equals(ime) && knjiga.getAutorKnjige().equals(autor)) {
                return knjiga;
            }
        }
        return null;
    }

}
