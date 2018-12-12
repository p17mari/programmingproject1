/**
Π2017089 
Αργυρώ Μαριόλη
14/11/18
*/
/** Υπολογίζεται η κλάση Contact με να περιέχει data members: 
fullname: Oνοματεπώνυμo τύπος String, phonenumber: Τηλεφωνικός	 αριθμός	τυπου long,	email: τύπου String.*/
public class Contact { 
   //γίνεται δήλωση μεταβλητών.
   private String fullname;
   private long phonenumber;
   private String email;
 
//κατασκευάζονται constructor.   
    public Contact(String fullname, String email, long phonenumber) {
        this(fullname, email);
        this.phonenumber=phonenumber;
    }

    public Contact (String name,long phonenumber) 
   {
      this.fullname = name;
      this.setPhonenumber(phonenumber); //χρήση μεθόδου set.
   }
   public Contact (String name,String email) 
   {
      this.fullname = name;
      this.setEmail(email); //χρήση μεθόδου set.
   }
   public Contact(){
    
   }
//χρησιμοποιήται μέθοδος set.
    public void setPhonenumber(long phonenumber) {
       this.phonenumber=phonenumber;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public void setFullname(String fullname) {
        this.fullname=fullname;
    }
//χρησιμοποιήται μέθοδος get.


    public String getFullname() {
        return fullname;
    }
    public String getEmail() {
        return email;
    }

 

    public long getPhonenumber  () {
        return phonenumber;
    }

//χρησιμοποιήται μέθοδος String to String
    public String toString() {
        return fullname + ":\t" + phonenumber + ";\t" + email;
    }
//επιστρέφει boolean τιμή που δηλώνει αν το Contact αναπαριστά ίδιο πρόσωπο με το αντικείμενο Contact other.
    public boolean equals(Contact other)
   {
      return this.fullname==other.fullname && this.phonenumber==other.phonenumber && this.email==other.email;
   }
//επιστρέφει boolean τιμή που δηλώνει αν το Contact είναι όμοιο με το αντικείμενο Contact other.
    public boolean isDuplicate(Contact other)
   {
      return this.phonenumber == other.phonenumber || this.email == other.email;
   }
//υπολογίζεται η main.
    public static void main(String[] args) {
   //ορίζεται παράδειγμα c1
    Contact c1 = new Contact();
    c1.setEmail("riggas-ionio.gr");
    c1.setFullname("Dimitrios Ringas");
    c1.setEmail("riggas@ionio.gr");
    c1.setEmail("riggas-ionio.gr");
    c1.setPhonenumber(6948012345L);
    c1.setPhonenumber(2661341785L);
    
    
   //ορίζεται παράδειγμα c2
   Contact c2 = new Contact("Ringas Dimitrios", 6948012345L);
   //χρήση μεθόδου isDuplicate για να συγκριθούν μερικά στοιχεία του c2 με του c1.
    System.out.println("Same person? "+ c2.isDuplicate(c1) );
    c2.setEmail("riggas@.ionio.gr");
    
   //χρήση μεθόδου equals για να συγκριθούν όλα τα στοιχεία του c2 με του c1.
    System.out.println("Equal contact entry? "+ c2.equals(c1) );
    System.out.println(c1);
    System.out.println(c2);
   }
}
