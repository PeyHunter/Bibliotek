public class Eksemplar
{

    private String stregKode;
    private Bog bog;

    public Eksemplar()
    {
    }

    public Eksemplar(String s, Bog b)
    {
        this.stregKode = s;
        this.bog = b;
    }


    public String getStregKode()
    {
        return stregKode;
    }

    public Bog getBog()
    {
        return bog;
    }


}

//Hvis der er tale om arv skal man kunne beskrive klasserne ret bestemt.
//Der er INTET der hedder multiple arv - det hedder interface. En klasse kan kun arve fra en klasse!
