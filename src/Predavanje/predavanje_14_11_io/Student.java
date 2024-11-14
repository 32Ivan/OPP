package Predavanje.predavanje_14_11_io;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndexa;

    public Student(String ime, String prezime, Integer brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(Integer brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    @Override
    public String toString() {
        return "Student = " +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndexa=" + brojIndexa;
    }
}
