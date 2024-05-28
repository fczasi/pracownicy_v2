package com.company;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, double pensja)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }
    public String getImie()
    {
        return imie;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public double getPensja()
    {
        return pensja;
    }

    public  String toString()
    {
        return "Pracownik: "+ imie+" "+nazwisko+", pensja= "+pensja;
    }
}
