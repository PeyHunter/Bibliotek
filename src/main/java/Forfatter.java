import java.util.ArrayList;

public class Forfatter extends Person
{




    private String nationalitet;
    private int foedeAar;

    public Forfatter()
    {
    }

    public Forfatter(String name, int age, String gender, String nat, int fAar)
    {
       super(name, age, gender);
        this.nationalitet = nat;
        this.foedeAar = fAar;
    }

    public String getNationalitet()
    {
        return nationalitet;
    }

    public int getFoedeAar()
    {
        return foedeAar;
    }

}
