public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(int regBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(regBroj, marka, godinaProizvodnje);
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan broj.");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan broj.");
        }
        this.brojVrata = brojVrata;
    }

    @Override
    public String prikaziPodatke() {
        return "Automobil{" +
                "regBroj=" + getRegBroj() +
                ", marka='" + getMarka() + '\'' +
                ", godinaProizvodnje=" + getGodinaProizvodnje() + '\'' +
                ", brojVrata=" + brojVrata +
                '}';
    }
}
