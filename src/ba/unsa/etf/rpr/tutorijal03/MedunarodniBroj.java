package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    String broj;

    MedunarodniBroj(String drzava, String broj) {
        this.broj = drzava + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String ispisi() {
        return broj;
    }
}
