 class Bicikl extends Vozilo{
    private String vrsta;

     public Bicikl(String tip, double speed, String vrsta) {
         super(tip, speed);
         this.vrsta = vrsta;
     }

     @Override
     public void kretanje() {
         System.out.println("Bicikl  "+ this.getTip() + " " + this.vrsta + ", se kreće brzinom " + this.getSpeed() + " km/h.");
     }
 }
