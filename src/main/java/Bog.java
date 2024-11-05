public class Bog {

    private String      titel;
    private String      genre;
    private int         antal = 0;
    private int         aarstal;


    public Bog () {}

    public Bog(String titel, String genre, int antal, int aarstal) {
        this.titel = titel;
        this.genre = genre;
        this.antal = antal;
        this.aarstal = aarstal;
    }


    public String getTitel()
    {
        return titel;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getAntal()
    {
        return antal;
    }

    public int getAarstal()
    {
        return aarstal;
    }






}
