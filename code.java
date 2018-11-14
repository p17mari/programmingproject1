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
//χρησιμοποιήται μέθοδος String to String
    public String toString() {
        return "Contact is named "+this.fullname 
               "Contact's email is" this.email
                +" and has this phone number " +this.phonenumber
    }
//υπολογίζεται η main.
public static void main(String[] args) {
   //ορίζεται παράδειγμα 1
    Contact invalid1 = new Contact("Ringas Dimitrios", "riggas-ionio.gr");
    invalid1.setPhonenumber=113513701
    System.out.println(invalid1.toString());
   //ορίζεται παράδειγμα 2
    Contact invalid2= new Contact("Ringas Dimitrios"," riggas@.ioniogr");
    invalid2.setPhonenumber=223513701
    System.out.println(invalid2.toString()); 
   //ορίζονται ορθά στοιχεία 1
    Contact valid1= new Contact("Ringas Dimitrios","riggas@ionio.gr");
    valid1.setPhonenumber=6948012345
    System.out.println(valid1.toString());  
   //οριζονταί ορθά στοιχεια 2
    Contact valid2= new Contact("Ringas Dimitrios","riggas@ionio.gr ");
    valid2.setPhonenumber=2661012345
    System.out.println(valid2.toString());  
  // Χρησιμόποιειται μέθοδος equals για να συγκρίνουμε τα 
       //Fullname
        System.out.println(invalid1.getFullname() == new String("Dimitrios Ringas"));    
        System.out.println(invalid1.getFullname().equals( new String("Dimitrios Ringas") )); 
        System.out.println(invalid1.getFullname() == "Dimitrios Ringas");
        //email  
        System.out.println(invalid1.get.Email() == new String("riggas-ionio.gr"));    
        System.out.println(invalid1.getEmail().equals( new String("riggas-ionio.gr") ))
        System.out.println(invalid1.getEmail() == "riggas-ionio.gr");
   }
}
           
