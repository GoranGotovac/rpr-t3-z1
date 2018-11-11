package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private String broj;
    private Grad grad;

    FiksniBroj(Grad grad, String broj) {
        if (grad == Grad.SARAJEVO) {
            this.broj = "033/" + broj;
        }
        if (grad == Grad.BIHAC) {
            this.broj = "037/" + broj;
        }
        if (grad == Grad.ORASJE) {
            this.broj = "031/" + broj;
        }
        if (grad == Grad.TUZLA) {
            this.broj = "035/" + broj;
        }
        if (grad == Grad.ZENICA) {
            this.broj = "032/" + broj;
        }
        if (grad == Grad.GORAZDE) {
            this.broj = "038/" + broj;
        }
        if (grad == Grad.TRAVNIK) {
            this.broj = "030/" + broj;
        }
        if (grad == Grad.MOSTAR) {
            this.broj = "036/" + broj;
        }
        if (grad == Grad.SIROKIBRIJEG) {
            this.broj = "039/" + broj;
        }
        if (grad == Grad.LIVNO) {
            this.broj = "034/" + broj;
        }
        if (grad == Grad.BRCKO) {
            this.broj = "049/" + broj;
        }
        this.grad = grad;
    }

    ;

    @Override
    public int hashCode() {
        return 0;
    }

    enum Grad {SARAJEVO, BIHAC, ORASJE, TUZLA, ZENICA, GORAZDE, TRAVNIK, MOSTAR, SIROKIBRIJEG, LIVNO, BRCKO}

    public String ispisi() {
        return broj;
    }

    public Grad getGrad() {
        return grad;
    }
}
