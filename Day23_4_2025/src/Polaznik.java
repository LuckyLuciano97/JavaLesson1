class Polaznik {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public void ispisiPodatke() {
        System.out.println(ime + " " + prezime + " (" + email + ")");
    }
}