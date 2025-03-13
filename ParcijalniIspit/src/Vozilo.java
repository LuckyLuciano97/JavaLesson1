public class Vozilo {
    private int regBroj;
    private String marka;
    private int godinaProizvodnje;


    public Vozilo(int regBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {

        if (regBroj <= 0) {
            throw new NeispravniPodaciException("Registarski broj mora biti pozitivan broj.");
        }
        if (marka == null || marka.trim().isEmpty()) {
            throw new NeispravniPodaciException("Marka vozila ne smije biti prazna.");
        }
        if (godinaProizvodnje <= 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivan broj.");
        }

        this.regBroj = regBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getRegBroj() {
        return regBroj;
    }

    public void setRegBroj(int regBroj) throws NeispravniPodaciException {
        if (regBroj <= 0) {
            throw new NeispravniPodaciException("Registarski broj mora biti pozitivan broj.");
        }
        this.regBroj = regBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) throws NeispravniPodaciException {
        if (marka == null || marka.trim().isEmpty()) {
            throw new NeispravniPodaciException("Marka vozila ne smije biti prazna.");
        }
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje <= 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivan broj.");
        }
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String prikaziPodatke() {
        return "Vozilo{" +
                "regBroj=" + regBroj +
                ", marka='" + marka + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                '}';
    }
}
