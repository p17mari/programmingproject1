public class Contact{
   private String fullname;
   private double phonenumber=6948012345;
   private String email; 
   }
   
   public static int contacts=0;
   
public Contact(String fullname, String email){
   this.fullname=fullname;
   this.email=email;
   contacts++;
   }
public Contact(String fullname, String email, double phonenumber){
   this(fullname, email);
   this.phonenumber=phonenumber;
   }
public   
