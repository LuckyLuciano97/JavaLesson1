public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(int regBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(regBroj, marka, godinaProizvodnje);
        if (tipMotora == null || tipMotora.trim().isEmpty()) {
            throw new NeispravniPodaciException("Tip motora ne smije biti prazan.");
        }
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) throws NeispravniPodaciException {
        if (tipMotora == null || tipMotora.trim().isEmpty()) {
            throw new NeispravniPodaciException("Tip motora ne smije biti prazan.");
        }
        this.tipMotora = tipMotora;
    }

    @Override
    public String prikaziPodatke() {
        return "Motocikl{" +
                "regBroj=" + getRegBroj() +
                ", marka='" + getMarka() + '\'' +
                ", godinaProizvodnje=" + getGodinaProizvodnje() + '\'' +
                ", tipMotora='" + tipMotora + '\'' +
                '}';
    }
}