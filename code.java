/**
Π2017089 
Αργυρώ Μαριόλη
14/11/18

*/
//υπολογίζεται η κλάση.
public class Contact { 
   //γίνεται δήλωση μεταβλητών.
   private String fullname;
   private double phonenumber;
   private String email; 
   private boolean entry;
   }
//κατασκευάζονται constructor.   
public Contact(String fullname, String email) {
   this.fullname=fullname;
   this.email=email;
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
protected void finalize() {
   contacts--;
}
//χρησιμοποιήται μέθοδος String to String
    public String toString() {
        return "Contact is named "+this.fullname 
               "Contact's email is" this.email
                +" and has this phone number " +this.phonenumber
//υπολογίζεται η main.
public static void main(String[] args) {
    Contact invalid1 = new Contact("Ringas Dimitrios", "riggas-ionio.gr");
    invalid1.setPhonenumber=113513701
    System.out.println(invalid1.toString());
    Contact invalid2= new Contact("Ringas Dimitrios"," riggas@.ioniogr");
    invalid2.setPhonenumber=223513701
  // Χρησιμόποιειται μέθοδος equals για να συγκρίνουμε τα 
       //Fullname
        System.out.println(george1.getFullname() == new String("Dimitrios Ringas"));    
        System.out.println(george1.getFullname().equals( new String("Dimitrios Ringas") )); 
        System.out.println(george1.getFullname() == "Dimitrios Ringas");
        //email  
        System.out.println(george1get.Email() == new String(""));    
        System.out.println(george1.getEmail().equals( new String("") ))
        System.out.println(george1.getEmail() == "");
           
        /*
Invalid email: riggas-ionio.gr
Invalid number: 113513701
Same person? false
Invalid email: riggas@.ioniogr
Invalid email: riggas@ioniogr.
Same person? true
Equal contact entry? false
Dimitrios Ringas:       2661012345;     riggas@ionio.gr 
Ringas Dimitrios:       6948012345;     riggas@ionio.gr
