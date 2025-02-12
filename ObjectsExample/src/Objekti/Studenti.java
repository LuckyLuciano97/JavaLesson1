package Objekti;

import java.sql.Array;
import java.util.ArrayList;

public class Studenti {
    private  String ime;
    private  String prezime;
    private int brojIndeksa;
    private ArrayList<String> prijavljeniIspiti;

    public Studenti(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prijavljeniIspiti = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa=" + brojIndeksa +
                ", prijavljeniIspiti=" + prijavljeniIspiti +
                '}';
    }

    public void prijaviIspit(String ispit) {
        prijavljeniIspiti.add(ispit);
    }

    public void odjaviIspit(String ispit) {
        prijavljeniIspiti.remove(ispit);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public ArrayList<String> getPrijavljeniIspiti() {
        return prijavljeniIspiti;
    }

    public void setPrijavljeniIspiti(ArrayList<String> prijavljeniIspiti) {
        this.prijavljeniIspiti = prijavljeniIspiti;
    }
}
