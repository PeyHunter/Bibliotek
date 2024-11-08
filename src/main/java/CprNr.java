public class CprNr
{
    private String nummeret;

    public CprNr (String etCprNr)
    {
        nummeret = etCprNr;
    }

    public String getCprNr(String etCprNr)
    {
        return nummeret;
    }

    public void setCprNr(String etCprNr)
    {
        nummeret = etCprNr;
    }

    public int getDag()
    {
        return Integer.parseInt(nummeret.substring(0,2));
    }

    public int getMaaned()
    {
        return Integer.parseInt(nummeret.substring(2,4));
    }

    public int getAar()
    {

        if (Integer.parseInt(nummeret.substring(6,7)) <= 3)
            return 1900 + Integer.parseInt(nummeret.substring(4,6));

        if (Integer.parseInt(nummeret.substring(6,7)) >= 4 && Integer.parseInt(nummeret.substring(6,7)) <=5)
            return 1800 + Integer.parseInt(nummeret.substring(4,6));

        return 2000 + Integer.parseInt(nummeret.substring(4,6));
    }

    public Dato getDato()
    {
        Dato cprDato = new Dato(getDag(), getMaaned(), getAar()); //Her angiver jeg hvordan jeg indtaster ååret. Fordi jeg siger get(), så får jeg det konverteret.
        return cprDato;
    }

    public int getAlder()
    {
        return 2024 - getAar() ;
    }

    public boolean erMand()
    {
        if (Integer.parseInt(nummeret.substring(8,10)) % 2 == 0)
            return false;
        return true;
    }

    public boolean erKvinde()
    {
        if (Integer.parseInt(nummeret.substring(8,10)) % 2 !=0)
            return false;
        return true;
    } // man kan også bare sige !erMand()

    public boolean erValid()
    {
        if (nummeret.length() != 10 && !nummeret.matches("\\+d"))
            return false;

        Dato foedselsdag = getDato();

        //.now

        int[]ciffer = {0,5,2,2,0,1,9,6,7,2};
        int[]vaegt = {3,4,2,7,6,5,4,3,2,1};
        int[]udregnet = {0,15,0,14,12,0,4,27,14,2};
        //
        return true;
    }


}
