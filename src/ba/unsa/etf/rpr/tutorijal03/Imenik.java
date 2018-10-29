package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    HashMap Imenik = new HashMap();
    HashMap Imenik2 = new HashMap();

    void dodaj(String ime, TelefonskiBroj broj) {
        Imenik.put(ime, broj);
        Imenik2.put(broj, ime);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj b;
        b = (TelefonskiBroj) Imenik.get(ime);
        String c = (String) b.ispisi();
        return c;
    }

    public String dajIme(TelefonskiBroj broj) {
        String c = (String) Imenik2.get(broj);
        return c;
    }
}
