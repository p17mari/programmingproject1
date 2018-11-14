/**
Π2017089 
Αργυρώ Μαριόλη
14/11/18
Δεν κατάφερα να κάνω χρήση μεταβλητής boolean.
*/
/**υπολογίζεται η κλάση Contact με να περιέχει data members: 
fullname: Oνοματεπώνυμo τύπος String, phonenumber: Τηλεφωνικός	 αριθμός	τυπου long,	email:	 τύπου String.*/
public class Contact { 
   //γίνεται δήλωση μεταβλητών.
   private String fullname;
   private long phonenumber;
   private String email;
   }
//κατασκευάζονται constructor.   

public Contact(String fullname) {
   this.fullname=fullname;
   } 
public Contact(String email){
   this.email=email;
   }
public Contact (String name,long number) 
   {
      fullName = name;
      this.setPhonenumber(number); //χρήση μεθόδου set.
   }
public Contact(String fullname, String email, long phonenumber) {
   this(fullname, email);
   this.phonenumber=phonenumber;
   }
//χρησιμοποιήται μέθοδος get.
public String getFullname() {
   return this.fullname;
}
public String getEmail() {
   return this.email;
}
public long getPhonenumber {
   return this.phonenumber;
}
//χρησιμοποιήται μέθοδος set.
public static void setPhonenumber(long phonenumber) {
   this.phonenumber=phonenumber;
}
 public static int setNumberOfContacts() {
    return Contact.contacts;
}
//χρησιμοποιήται μέθοδος String to String
    public String toString() {
       contact = fullName + ":\t" + phonenumber + ";\t" + email;
        return contact
    }
//υπολογίζεται η main.
public static void main(String[] args) {
   //ορίζεται παράδειγμα valid1
    Contact valid1 = new Contact(){
    invalid1.setEmail=riggas-ionio.gr
    valid1.setFullname("Dimitrios Ringas");
    valid1.setEmail("riggas-ionio.gr");
    valid1.setEmail("riggas@ionio.gr");
    valid1.setPhonenumber(6948012345));
    valid1.setPhonenumber(0661341785);
    System.out.println(valid1.toString());
    }
   //ορίζεται παράδειγμα valid2
   valid2 = new Contact("Ringas Dimitrios", 6948012345);
   //χρήση μεθόδου isDuplicate για να συγκριθούν μερικά στοιχεία του valid2 με του valid1.
    System.out.println("Same person? "+ valid2.isDuplicate(valid1) );
    valid2.setEmail=riggas@.ionio.gr
    System.out.println(valid2.toString()); 
   //χρήση μεθόδου equals για να sόλα τα στοιχεία του valid2 με του valif
    System.out.println("Equal contact entry? "+ valid2.equals(valid1) );
    System.out.println(valid1);
    System.out.println(valid2);
    
   }
