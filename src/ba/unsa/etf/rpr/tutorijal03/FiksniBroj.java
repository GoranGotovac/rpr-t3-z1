package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    String broj;
    enum Grad{Sarajevo, Bihac, Orasje, Tuzla, Zenica, Gorazde, Travnik, Mostar, SirokiBrijeg, Livno, Brcko};
    FiksniBroj(Grad grad, String broj) {
        if(grad == Grad.Sarajevo) {
            this.broj="033/" + broj;
        }
        if(grad == Grad.Bihac) {
            this.broj="037/" + broj;
        }
        if(grad == Grad.Orasje) {
            this.broj="031/" + broj;
        }
        if(grad == Grad.Tuzla) {
            this.broj="035/" + broj;
        }
        if(grad == Grad.Zenica) {
            this.broj="032/" + broj;
        }
        if(grad == Grad.Gorazde) {
            this.broj="038/" + broj;
        }
        if(grad == Grad.Travnik) {
            this.broj="030/" + broj;
        }
        if(grad == Grad.Mostar) {
            this.broj="036/" + broj;
        }
        if(grad == Grad.SirokiBrijeg) {
            this.broj="039/" + broj;
        }
        if(grad == Grad.Livno) {
            this.broj="034/" + broj;
        }
        if(grad == Grad.Brcko) {
            this.broj="049/" + broj;
        }

    }
    public String ispisi() {
        return broj;
    }

}
