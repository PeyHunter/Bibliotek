import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Udlaan {

    DateTimeFormatter   dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");

    private Laaner      laanerID;
    private int         eksemplarId;
    private int         udlaantEksemplar;
    private LocalDate   dato;

    public Udlaan() {}

    public ArrayList<Udlaan> udlaansListe = new ArrayList<>();

    public Udlaan(LocalDate dato, Laaner laanerID, int eksId, int udEks) {
        this.dato = dato;
        this.laanerID = laanerID;
        this.eksemplarId = eksId;
        this.udlaantEksemplar = udEks;
    }



    // add to array - if (laanerID == laaner) udlaansListe++
    // udlaantEksemplar--


//    public void createUdlaan(){
//        udlaansListe.add();
//
//    }


//    public int getAntalUdlaan(){
//        return ;
//    }

    public Laaner getLaanerID() {
        return laanerID;
    }

    public int getEksemplarId(){
        return eksemplarId;
    }

    public int getUdlaantEksemplar(){
        return udlaantEksemplar;
    }

    public LocalDate getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return"Udlaan: \n" +
                "Dato: " + dato.format(dateFormatter) + "\n" +
                "Laaner: " + laanerID +"\n" +
                "Eksemplar" + eksemplarId + "\n" +
                "Udlaant Eksemplar: " + udlaantEksemplar + "\n";

    }



}
