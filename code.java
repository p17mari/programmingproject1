/**
Π2017089 
Αργυρώ Μαριόλη
14/11/18
Δεν κατάφερα να κάνω χρήση μεταβλητής boolean,να θέσω ελάχιστο και μέγιστο στην double και να χρησιμοποιήσω μέθοδο is duplicate.
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
   //ορίζεται παράδειγμα 1
    Contact invalid1 = new Contact("Ringas Dimitrios", "113513701");
    invalid1.setEmail=riggas-ionio.gr
    System.out.println(invalid1.toString());
   //ορίζεται παράδειγμα 2
    Contact invalid2= new Contact("Ringas Dimitrios","223513701");
    invalid2.setEmail=riggas@.ioniogr
    System.out.println(invalid2.toString()); 
    // Χρησιμόποιειται μέθοδος equals για να συγκρίνουμε τα invalid1,invalid2.
   if (invalid1.fullname.equals.invalid2.fullname)
     ?System.out.println("These two contacts refer to the same person");
       if (invalid1.email.equals.invalid2.email && invalid1.phonenumber.equals.invalid2.phonenumber)
        ?System.out.println("The contact's entries are the same")
        :System.out.println("The contact's entries are not the same");
     :System.out.println("These are different contacts");
   //ορίζονται ορθά στοιχεία 1
    Contact valid1= new Contact("Ringas Dimitrios","6948012345");
    valid1.setEmail=riggas@ionio.gr
    System.out.println(valid1.toString());  
   //οριζονταί ορθά στοιχεια 2
    Contact valid2= new Contact("Ringas Dimitrios","2661012345");
    valid2.setEmail=riggas@ionio.gr
    System.out.println(valid2.toString()); 
    // Χρησιμόποιειται μέθοδος equals για να συγκρίνουμε τα valid1,valid2.
     if (valid1.fullname.equals.valid2.fullname)
     ?System.out.println("These two contacts refer to the same person");
       if (valid1.email.equals.valid2.email && valid1.phonenumber.equals.valid2.phonenumber)
        ?System.out.println("The contact's entries are the same")
        :System.out.println("The contact's entries are not the same");
     :System.out.println("These are different contacts");
   }
