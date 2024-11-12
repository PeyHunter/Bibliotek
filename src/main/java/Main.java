import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main
{


    public static void main(String[] args)
    {


        Forfatter mah = new Forfatter("Martin Hansen", 52, "Mand", "Dansk",  1909);

        Bog loegnren = new Bog("Løgereren", "Krimi", mah);

        Eksemplar l1 = new Eksemplar("123456", loegnren);

        Laaner poul = new Laaner("Poul Thorsen", 52, "Mand", "poul@gmail", new CprNr("928939-3435"));

        Udlaan udlaan = new Udlaan(poul, l1, new Dato(984389345));



        System.out.println(
                "Eksemplar: " + l1.getStregKode() + "\n" +
                "Bog: " + loegnren.getTitel() + "\n" +
                "Forfatter: " + mah.getName() + "\n" +
                "Laaner: " + udlaan.getLaaner().getName()  +  " (" + poul.getCprNr() + ")");
    }
}


//
//        //CREATE BIBLIOTEK
//        Bibliotek bibliotek1 = new Bibliotek("Nørrebro Bibliotek", "Københavns Komunne", "Jagtvej 13, 2200", "11223344");
//        System.out.println(bibliotek1);
//
//        //CREATE LOCAL TIME
//        LocalDate today = LocalDate.now();
//
//        //CREATE BOG
//        Bog bog = new Bog();
//        bog.addBookToAuthor();
//
//
//        //CREATE LAANER
//        Laaner laaner = new Laaner();
//        laaner.createLaaner();
//
//
//
//
//
//
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
//
//
//
//
//        Udlaan udlaan1 = new Udlaan(today, laaner.getLaanerId(2), 10023, 3 );
//        Udlaan udlaan2 = new Udlaan(today, laaner.getLaanerId(5), 2345, 1);
//
//        System.out.println(udlaan2);
//
//
//
//
//
//
//
//        // eksmemplar--a

