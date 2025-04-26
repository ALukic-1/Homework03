package h3;

import h1.Account;

public class CompanyAccount extends Account {

    public void print(){
        Account test = new Account();

        System.out.println(test.owner);
       System.out.println(this.pin);
        System.out.println(test.getInternalNode());
        System.out.println(test.getBalance());
    }
}
