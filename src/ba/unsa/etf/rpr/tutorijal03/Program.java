package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.Set;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;
public class Program {
    public static Scanner ulaz = new Scanner(System.in);
    public static void main(String[] args) {
        String broj, ime, drzava,grad;
        Imenik zuteStrane = new Imenik();
        int a, b, brojMobitela;
        boolean x, y;
        x = true;
        y = true;
        while (x) {
            System.out.println("Unesite broj za komandu koju želite: \n 1. Unos novog korisnika \n 2. Broj odrđenog korisnika \n " +
                    "3. Ime određenog korisnika \n 4. Imena korisnika iz nekog grada  \n " +
                    "5. Brojeve korisnika iz nekog grada \n 6. Svi korisnici koji počinju sa nekim slovom.\n " +
                    "7. Za prekid programa \n");
            a = ulaz.nextInt();
            if (a == 7) {
                x = false;
            }
            switch (a) {
                case 1:
                    while (y) {
                        System.out.print("Za unos korisnika sa fiksnim brojem tefona unesite broj 0\nZa unos korisnika sa mobilnim brojem" +
                                " unesite broj 1\nZa unos korisnika sa međunarodnim brojem unesite broj 2\nZa prekid unosa korisnika unesite broj 3\n");
                        b = ulaz.nextInt();
                        if (b == 3) {
                            y = false;
                            break;
                        }
                        switch (b) {
                            case 0:

                                System.out.print("Unesite grad: ");
                                grad = ulaz.next();
                                FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(grad.toUpperCase());
                                System.out.print("Unesite broj: ");
                                ulaz.nextLine();
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                zuteStrane.dodaj(ime, new FiksniBroj(grad1, broj));

                                break;
                            case 1:
                                System.out.print("Unesite mobilnu mrežu: ");
                                brojMobitela = ulaz.nextInt();
                                System.out.print("Unesite broj: ");
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                zuteStrane.dodaj(ime, new MobilniBroj(brojMobitela, broj));
                                break;
                            case 2:
                                System.out.print("Unesite pozivni za državu: ");
                                drzava = ulaz.nextLine();
                                System.out.print("Unesite broj: ");
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                zuteStrane.dodaj(ime, new MedunarodniBroj(drzava, broj));
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Unesite ime korisnika: ");
                    ime = ulaz.nextLine();
                    broj = zuteStrane.dajBroj(ime);
                    System.out.println(broj);
                    break;
                case 3:
                    System.out.print("Za  korisnika sa fiksnim brojem tefona unesite broj 0, za korisnika sa mobilnim brojem" +
                            " unesite broj 1, za korisnika sa međunarodnim brojem unesite broj 2");
                    b = ulaz.nextInt();

                    switch (b) {
                        case 0:
                            System.out.print("Unesite grad: ");
                            FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                            System.out.print("Unesite broj: ");
                            ulaz.nextLine();
                            broj = ulaz.nextLine();
                            System.out.println(zuteStrane.dajIme(new FiksniBroj(grad1, broj)));
                            break;
                        case 1:
                            System.out.print("Unesite mobilnu mrežu: ");
                            brojMobitela = ulaz.nextInt();
                            System.out.print("Unesite broj: ");
                            broj = ulaz.nextLine();
                            System.out.println(zuteStrane.dajIme(new MobilniBroj(brojMobitela, broj)));
                            break;
                        case 2:
                            System.out.print("Unesite pozivni za državu: ");
                            drzava = ulaz.next();
                            System.out.print("Unesite broj: ");
                            broj = ulaz.nextLine();
                            System.out.println(zuteStrane.dajIme(new MedunarodniBroj(drzava, broj)));
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Unesite grad: ");
                    FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                    Set<String> set = zuteStrane.izGrada(grad1);
                    String result = "";
                    for (String ime2 : set) {
                        result += ime2 + ",";
                    }
                    System.out.println(result);
                    break;
                case 5:
                    System.out.print("Unesite grad: ");
                    FiksniBroj.Grad gradNovi = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                    Set<TelefonskiBroj> set2 = zuteStrane.izGradaBrojevi(gradNovi);
                    String result1 = "";
                    for (TelefonskiBroj ime2 : set2) {
                        result1 += ime2.ispisi() + ",";
                    }
                    System.out.println(result1);
                    break;
                case 6:
                    System.out.print("Unesite slovo: ");
                    String slovo = ulaz.nextLine();
                    String prvoSlovo = String.valueOf(slovo.charAt(0));
                    char c = prvoSlovo.charAt(0);
                    System.out.print(zuteStrane.naSlovo(c));
                    break;
            }

        }
    }
}
