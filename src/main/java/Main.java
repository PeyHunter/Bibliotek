import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args)
    {

        public static void main() {
            Forfatter mah = new Forfatter("Marting Hansen", "Dansk", 1909, 1955);
            Bog loegnren = new Bog("Løgereren", mah, 1950);
            Eksemplar l1 = new Eksemplar("123456", loegnren);

            Laaner poul = new Laaner("Poul Thorsen", "Hirtshals", "gmail", new CprNr("9239");
            Udlaan u1 = new Udlaan(poul, l1, new Dato(984389345));

        System.out.println("Forfatter til udlån" + u1.getEksemplarId().getBog().getForfatter().getNavn());

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

    }
}