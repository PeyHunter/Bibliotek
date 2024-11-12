

public class Udlaan
{

    private Laaner laaner;
    private Eksemplar eksemplar;
    private Dato udlaansDato;


    public Udlaan(Laaner l, Eksemplar e, Dato d)
    {
        this.laaner = l;
        this.eksemplar = e;
        this.udlaansDato = d;
    }

    public Laaner getLaaner()
    {
        return laaner;
    }

    public Eksemplar getEksemplar()
    {
        return eksemplar;
    }

    public Dato getUdlaansDato()
    {
        return udlaansDato;
    }




//
//    DateTimeFormatter   dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
//
//    private Laaner      laanerID;
//    private int         eksemplarId;
//    private int         udlaantEksemplar;
//    private LocalDate   dato;
//
//    public Udlaan() {}
//
//    public ArrayList<Udlaan> udlaansListe = new ArrayList<>();
//
//

//    public Udlaan createUdlaan() {
//        udlaansListe.add();
//    }


//    public void updateEksemplarAntal() {
//        if(laanerID== laanerNr ) {
//            udlaantEksemplar--;
//        }
//    }


    // add to array - if (laanerID == laaner) udlaansListe++
    // udlaantEksemplar--


//    public void createUdlaan(){
//        udlaansListe.add();
//
//    }


//    public int getAntalUdlaan(){
//        return ;
//    }


}
