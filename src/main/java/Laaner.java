import java.util.ArrayList;

public class Laaner
{

    public Laaner()
    {
    }

    private String laanerNavn;
    private String email;
    private CprNr cprNr;

    public Laaner(String laanerNavn, String email, CprNr cprNr)
    {
        this.laanerNavn = laanerNavn;
        this.email = email;
        this.cprNr = cprNr;
    }

    public String getLaanerNavn()
    {
        return laanerNavn;
    }

    public String getEmail()
    {
        return email;
    }

    public CprNr getCprNr()
    {
        return cprNr;
    }

}


//
//    public void createLaaner() {
//        laanerList.add(new Laaner(1, "John Doe", "12345678", "johndoe@example.com"));
//        laanerList.add(new Laaner(2, "Jane Smith", "23456789", "janesmith@example.com"));
//        laanerList.add(new Laaner(3, "Alice Johnson", "34567890", "alicejohnson@example.com"));
//        laanerList.add(new Laaner(4, "Bob Brown", "45678901", "bobbrown@example.com"));
//        laanerList.add(new Laaner(5, "Charlie Davis", "56789012", "charliedavis@example.com"));
//        laanerList.add(new Laaner(6, "Diana Clark", "67890123", "dianaclark@example.com"));
//        laanerList.add(new Laaner(7, "Eve Martin", "78901234", "evemartin@example.com"));
//        laanerList.add(new Laaner(8, "Frank Thompson", "89012345", "frankthompson@example.com"));
//        laanerList.add(new Laaner(9, "Grace White", "90123456", "gracewhite@example.com"));
//        laanerList.add(new Laaner(10, "Henry Green", "12345670", "henrygreen@example.com"));
//
//        for(int i = 0; i < laanerList.size(); i++){
//            System.out.println(laanerList.get(i));
//        }
//    }
