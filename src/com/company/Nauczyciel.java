package com.company;

public class Nauczyciel extends Pracownik
{
    private double premia;
    public Nauczyciel(String imie, String nazwisko, double pensja, double premia)
    {
        super(imie, nazwisko, pensja);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public String toString()
    {
        return "Nauczyciel: "+ getImie() +" "+ getNazwisko() +", pensja= "+getPensja()+", premia= "+premia;
    }
}
