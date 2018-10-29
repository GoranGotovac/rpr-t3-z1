package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj  {
    String broj;
    MobilniBroj(int mobilnaMreza, String broj) {
        this.broj = "0" + mobilnaMreza + "/" + broj;
    }
    public String ispisi() {
        return broj;
    }
}
