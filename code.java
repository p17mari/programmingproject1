/**
Π2017089 
Αργυρώ Μαριόλη
14/11/18
Δεν κατάφερα να κάνω χρήση μεταβλητής boolean,να θέσω ελάχιστο και μέγιστο στην double.
*/
/**υπολογίζεται η κλάση Contact με να περιέχει data members: 
fullname: Oνοματεπώνυμo τύπος String, phonenumber: Τηλεφωνικός	 αριθμός	τυπου double,	email:	 τύπου String.*/
public class Contact { 
   //γίνεται δήλωση μεταβλητών.
   private String fullname;
   private double phonenumber;
   private String email;
   }
//κατασκευάζονται constructor.   
public Contact(String fullname) {
   this.fullname=fullname;
   }
public Contact(String email){
   this.email=email;
   }
public Contact(String fullname, double phonenumber)) {
   this.fullname=fullname;
      this.phonenumber=phonenumber;
   }
public Contact(String fullname, String email, double phonenumber) {
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
public double getPhonenumber {
   return this.phonenumber;
}
//χρησιμοποιήται μέθοδος set.
public static void setPhonenumber(double phonenumber) {
   this.phonenumber=phonenumber;
}
 public static int setNumberOfContacts() {
    return Contact.contacts;
}
//χρησιμοποιήται μέθοδος String to String
    public String toString() {
        return "Contact is named "+this.fullname 
               "Contact's email is" this.email
                +" and has this phone number " +this.phonenumber
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
    System.out.println("Same person? "+ valid2.isDuplicate(valid1) );//χρήση μεθόδου isDuplicate.
    valid2.setEmail=riggas@.ioniogr
    System.out.println(valid2.toString()); 
    System.out.println("Equal contact entry? "+ c2.equals(c1) );// χρήση μεθόδου equals.
    System.out.println(valid1);
    System.out.println(valid2);
    
   }
