package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik {
    HashMap Imenik = new HashMap();
    HashMap Imenik2 = new HashMap();

    void dodaj(String ime, TelefonskiBroj broj) {
        Imenik.put(ime, broj);
        Imenik2.put(broj, ime);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj1;
        broj1 = (TelefonskiBroj) Imenik.get(ime);
        String c = (String) broj1.ispisi();
        return c;
    }

    public String dajIme(TelefonskiBroj broj) {
        String ime1 = (String) Imenik2.get(broj);
        return ime1;
    }

    public Set<String> izGrada(FiksniBroj.Grad sarajevo) {

    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad sarajevo) {

    }
}
