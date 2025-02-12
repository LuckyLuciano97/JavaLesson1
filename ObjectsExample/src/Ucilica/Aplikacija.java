package Ucilica;

public class Aplikacija {

    public static void main(String[] args){
        Trokut trokut1 = new Trokut("trokut1",5,6,7);
        System.out.println(trokut1);
        Pravokut pravokut = new Pravokut("pravokut1",5,6);
        System.out.println(pravokut);
        Krug krug = new Krug("krug",4);
        System.out.println(krug);

        krug.setRadius(9);
        System.out.println(krug);



    }
}
