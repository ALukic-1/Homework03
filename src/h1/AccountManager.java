package h1;

import java.awt.*;

public class AccountManager {
    Account acc = new Account();

    public void printValues(){
        System.out.println(acc.owner);
        //System.out.println(acc.balance);
        System.out.println(acc.pin);
        System.out.println(acc.internalNode);

        System.out.println(acc.getBalance());
    }
}
