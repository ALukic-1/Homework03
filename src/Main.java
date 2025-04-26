import Ex02.Email;
import Ex02.Message;
import Ex02.SMS;
import h2.ExternalAudit;
import h3.CompanyAccount;

public class Main {
    public static void main(String[] args){


//        ExternalAudit a = new ExternalAudit();
//
//
//
//a.values();

        Message m1 = new Email();
        Message m2 = new SMS();
        System .out. println (m1. getType ());
        System .out. println (m2. getType ());
        ((Email)m1).send (); // Uncomment this line and explain what happens

        
    }
}