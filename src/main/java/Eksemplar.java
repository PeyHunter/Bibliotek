public class Eksemplar
{

    private String stregKode;
    private Bog bog;

    public Eksemplar() {
    }

    public Eksemplar(String s, Bog b) {
        this.stregKode = s;
        this.bog = b;
    }


    public String getStregKode() {
        return stregKode;
    }

    public Bog getBog() {
        return bog;
    }



}
