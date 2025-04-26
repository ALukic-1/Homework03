package h2;

import h1.Account;

public class ExternalAudit {


    public void values(){
        Account a = new Account();

        System.out.println(a.owner);
        System.out.println(a.getBalance());
       System.out.println(a.getPin());
       System.out.println(a.getInternalNode());
    }
}
