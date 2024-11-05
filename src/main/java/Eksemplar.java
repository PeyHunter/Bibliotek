public class Eksemplar
{

    private int     udgivelsesAar;
    private int     antalEksemplar = 0;
    private int     stregkode = 13;


    public Eksemplar() {}


    public Eksemplar(int UdAar, int AnEks, int streg)
    {
        this.udgivelsesAar = UdAar;
        this.antalEksemplar = AnEks;
        this.stregkode= streg;

    }

    public int getUdgivelsesAar() {
        return udgivelsesAar;
    }

    public int getAntalEksemplar() {
        return antalEksemplar;
    }

    public int getStregkode() {
        return stregkode;
    }



}
