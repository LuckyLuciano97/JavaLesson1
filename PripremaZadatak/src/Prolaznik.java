class Polaznik {
    private int dob;
    private String ime;
    private String prezime;

    public Polaznik(int dob, String ime, String prezime) {
        this.dob = dob;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getDob() {
        return dob;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " (" + dob + " godina)";
    }
}