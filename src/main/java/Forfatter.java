import java.util.ArrayList;

public class Forfatter {

    private String      forfatterNavn;
    private String      nationalitet;
    private int         foedeAar;

    public Forfatter() {}

    public Forfatter(String ffNavn, String nat, int fAar) {
        this.forfatterNavn = ffNavn;
        this.nationalitet = nat;
        this.foedeAar = fAar;
    }

    public String getNavn() {
        return forfatterNavn;
    }

    public String getNationalitet() {
        return nationalitet;
    }
    public int getFoedeAar() {
        return foedeAar;
    }

}
