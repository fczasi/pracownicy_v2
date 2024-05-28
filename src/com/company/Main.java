package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kartoteka kartoteka = new Kartoteka();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running)
        {
            System.out.println("wybierz opcje");
            System.out.println("1 - dodaj pracownika");
            System.out.println("2 - dodaj nauczyciela");
            System.out.println("3 - usun pracownika");
            System.out.println("4 - wyswietl kartoteke");
            System.out.println("5 - wyczysc kartoteke");
            System.out.println("6 - wyjdz");
            int wyb = scanner.nextInt();
            scanner.nextLine();

            switch (wyb)
            {
                case 1:
                    System.out.println("podaj imie");
                    String imie =  scanner.nextLine();
                    System.out.println("podaj nazwisko");
                    String nazwisko = scanner.nextLine();
                    System.out.println("podaj pensje");
                    double pensja = scanner.nextDouble();

                    Pracownik pracownik = new Pracownik(imie, nazwisko, pensja);
                    kartoteka.dodajPrac(pracownik);
                    break;
                case 2:
                    System.out.println("podaj imie");
                    imie =  scanner.nextLine();
                    System.out.println("podaj nazwisko");
                    nazwisko = scanner.nextLine();
                    System.out.println("podaj pensje");
                    pensja = scanner.nextDouble();
                    System.out.println("podaj premie");
                    double premia = scanner.nextDouble();

                    Nauczyciel nauczyciel = new Nauczyciel(imie, nazwisko, pensja, premia);
                    kartoteka.dodajPrac(nauczyciel);
                    break;
                case 3:
                    System.out.println("podaj imie");
                    imie =  scanner.nextLine();
                    System.out.println("podaj nazwisko");
                    nazwisko = scanner.nextLine();

                    Pracownik doUsuniecia = null;
                    for (Pracownik p : kartoteka.getPracownicy())
                    {
                        if(p.getImie().equals(imie)&&p.getNazwisko().equals(nazwisko))
                        {
                            kartoteka.usunPrac(p);
                            doUsuniecia = p;
                            break;
                        }
                    }
                    if (doUsuniecia != null)
                    {
                        System.out.println("Pracownik usunienty");
                    }else
                    {
                        System.out.println("Pracownik nie istnieje");
                    }
                    break;
                case 4:
                    kartoteka.wyswieltPrac();
                    break;
                case 5:
                    kartoteka.czyscKart();
                    System.out.println("Kartoteka wyczyszczona");
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("wybrono zla opcje");
                    break;
            }
        }
        scanner.close();
    }
}
