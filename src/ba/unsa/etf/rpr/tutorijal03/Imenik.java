package ba.unsa.etf.rpr.tutorijal03;
        java.lang.Object

public class Imenik {
    HashMap Imenik = new HashMap();
    HashMap Imenik2 = new HashMap();

    void Dodaj(String ime, TelefonskiBroj broj) {
        Imenik.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj b;
        b = Imenik.get(ime);
        return b.ispisi();
    }
}
