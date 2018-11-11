package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        this.broj = "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String ispisi() {
        return broj;
    }
}
