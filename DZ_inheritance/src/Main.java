public class Main {
    public static void main(String[] args) {

        Macka macka = new Macka("Kika");
        Pas pas = new Pas("Rex");
        Krava krava = new Krava("Milka");
        Ovca ovca = new Ovca("Bjelka");
        Pijetao pijetao = new Pijetao("Foghorn Leghorn");

        Zivotinja[] zivotinje = {pas, macka, krava, ovca, pijetao};

        for (Zivotinja z : zivotinje) {
            z.seZove();
            z.glasanje();
        }
    }
}
