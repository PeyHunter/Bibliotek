public class Udlaan {

    private int     dato;
    private int     laanerID;
    private int     eksemplarId;
    private int     udlaantEksemplar;


    public Udlaan() {}

    public Udlaan(int dat, int lID, int eksId, int udEks) {
        this.dato = dat;
        this.laanerID = lID;
        this.eksemplarId = eksId;
        this.udlaantEksemplar = udEks;
    }

    public int getAntalUdlaan(){
        return dato;
    }

    public int getMaxUdlaan(){
        return laanerID;
    }

    public int getEksemplarId(){
        return eksemplarId;
    }

    public int getUdlaantEksemplar(){
        return udlaantEksemplar;
    }
}
