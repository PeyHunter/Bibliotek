public class Forfatter {

    private String      forfatterNavn;
    private String      forlag;
    private String      nationalitet;
    private int         foedeAar;
    private int         doedsAar;


    public Forfatter() {}

    public Forfatter(String ffNavn, String forl, String nat, int fAar, int dAar) {
        this.forfatterNavn = ffNavn;
        this.forlag = forl;
        this.nationalitet = nat;
        this.foedeAar = fAar;
        this.doedsAar = dAar;
    }

    public String getForfatterNavn() {
        return forfatterNavn;
    }

    public String getForlag() {
        return forlag;
    }

    public String getNationalitet() {
        return nationalitet;
    }
    public int getFoedeAar() {
        return foedeAar;
    }
    public int getDoedsAar() {
        return doedsAar;
    }

}
