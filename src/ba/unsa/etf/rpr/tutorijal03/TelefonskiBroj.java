package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {

    public abstract int hashCode();

    public abstract String ispisi();

    public int compareTo(TelefonskiBroj o) {
        return ispisi().compareTo(o.ispisi());
    }
}
