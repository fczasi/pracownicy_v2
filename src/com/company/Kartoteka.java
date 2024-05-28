package com.company;
import java.util.ArrayList;
import java.util.List;


public class Kartoteka {
    private List<Pracownik>pracownicy;

    public Kartoteka()
    {
        pracownicy = new ArrayList<>();
    }
    public void dodajPrac(Pracownik pracownik)
    {
        pracownicy.add(pracownik);
    }
    public void usunPrac(Pracownik pracownik)
    {
        pracownicy.remove(pracownik);
    }
    public void czyscKart()
    {
        pracownicy.clear();
    }
    public void wyswieltPrac()
    {
        for (Pracownik pracownik : pracownicy)
        {
            System.out.println(pracownik);
        }
    }
    public List<Pracownik> getPracownicy(){return pracownicy;}
}
