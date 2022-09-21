public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ksiazka ksiazka = new Ksiazka("Ksiazka", 12, 200);
        System.out.println(ksiazka.toString());
        Ebook ebook = new Ebook("Ebook", 12, 200);
        System.out.println(ebook.toString());
    }
}

/*
Grupa 2
Publikacja
private lub do dziedziczenia
-nazwa
-cena

dziedziczy ksiazka
-liczba stron

dziedziczy ebook
-ilosc miejsca

gettery settery
konstruktory to string
*/