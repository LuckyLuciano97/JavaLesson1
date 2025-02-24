package Ucilica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ucilica {
    private String naziv;
    private List<GeoLik> likovi;

    public Ucilica(String naziv) {
        this.naziv = naziv;
        this.likovi = new ArrayList<>();
    }

    public void dodajLik(GeoLik lik) {
        likovi.add(lik);
    }

    public void ispišiSveLikove() {
        System.out.println("Lista svih likova " + naziv + ":");
        for (GeoLik lik : likovi) {
            System.out.println(lik);
        }
    }

    public void sortirajLikove() {
        Collections.sort(likovi);
    }

    public void ispišiSortiranoPoPovrišni() {
        sortirajLikove();
        System.out.println("Sortirano (uzlazno) " + naziv + ":");
        for (GeoLik lik : likovi) {
            System.out.println(lik.getNaziv() + ": površina = " + lik.getPovršina());
        }
    }

    public List<GeoLik> getLikovi() {
        return likovi;
    }

    public String getNaziv() {
        return naziv;
    }
}