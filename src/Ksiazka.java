public class Ksiazka extends Publikacja{
    private int liczbaStron;
    public Ksiazka(String nazwa, int cena, int liczbaStron) {
        super(nazwa, cena);
        this.liczbaStron = liczbaStron;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String toString() {
        return "Ksiazka "+ getNazwa() + " cena "+ getCena() +
                " liczbaStron " + liczbaStron;
    }
}
