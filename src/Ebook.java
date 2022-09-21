public class Ebook extends Publikacja{
    private int iloscMiejsca;
    public Ebook(String nazwa, int cena, int iloscMiejsca) {
        super(nazwa, cena);
        this.iloscMiejsca = iloscMiejsca;
    }

    public int getIloscMiejsca() {
        return iloscMiejsca;
    }

    public void setIloscMiejsca(int iloscMiejsca) {
        this.iloscMiejsca = iloscMiejsca;
    }

    @Override
    public String toString() {
        return "Ebook " + getNazwa() + " cena " + getCena() +
                " iloscMiejsca " + iloscMiejsca + " MB";
    }
}
