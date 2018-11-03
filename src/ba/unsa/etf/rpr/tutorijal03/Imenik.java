package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    HashMap<String, TelefonskiBroj> gradovi = new HashMap<>();

    void dodaj(String ime, TelefonskiBroj broj) {
        gradovi.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj1;
        broj1 = (TelefonskiBroj) gradovi.get(ime);
        String c = (String) broj1.ispisi();
        return c;
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> m : gradovi.entrySet()) {
            TelefonskiBroj telefonskiBroj = m.getValue();
            if (((TelefonskiBroj) telefonskiBroj).ispisi().equals(broj)) {
                return m.getKey();
            }
        }
        return null;
    }

    public Set<String> izGrada(FiksniBroj.Grad grad) {
        Set<String> set = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> m : gradovi.entrySet()) {
            TelefonskiBroj telefonskiBroj = m.getValue();
            if (telefonskiBroj instanceof FiksniBroj) {
                if (((FiksniBroj) telefonskiBroj).getGrad().equals(grad)) {
                    set.add(m.getKey());
                }
            }
        }
        return set;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad grad) {
        Set<TelefonskiBroj> set = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> m : gradovi.entrySet()) {
            TelefonskiBroj telefonskiBroj = m.getValue();
            if (telefonskiBroj instanceof FiksniBroj) {
                if (((FiksniBroj) telefonskiBroj).getGrad().equals(grad)) {
                    set.add(m.getValue());
                }
            }
        }
        return set;
    }

    public String naSlovo(char g) {
        String string = "";
        int i = 1;
        for (Map.Entry<String, TelefonskiBroj> m : gradovi.entrySet()) {
            String telefonskiBroj = m.getKey();
            if ((Boolean) telefonskiBroj.startsWith(String.valueOf(g))) {
                string += i + ". " + telefonskiBroj + " - " + m.getValue().ispisi() + "\n";
                i++;
            }
        }
        return string;
    }
}
