 public class Knjiga implements PosudbaKnjige, Comparable<Knjiga> {
    private String naslov;
    private boolean jePosudjena;

    public Knjiga(String naslov, boolean jePosudjena) {
        this.naslov = naslov;
        this.jePosudjena = jePosudjena;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", jePosudjena=" + jePosudjena +
                '}';
    }

    @Override
    public void posudiKnjigu() {
        this.jePosudjena = true;
        System.out.println(this.naslov + " je posudjena");

    }

     @Override
    public void vratiKnjigu() {
        this.jePosudjena = false;
         System.out.println(this.naslov + " je vracena");
    }

    @Override
    public int compareTo(Knjiga o) {
        return this.naslov.compareTo(o.naslov);
    }
}
