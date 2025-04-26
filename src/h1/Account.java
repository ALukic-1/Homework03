package h1;

public class Account {

    public String owner = "me";
    private double balance = 1.0;
    protected int pin = 1234;
    String internalNode = "blablabla"; //default: package-private access


    public double getBalance(){
        return balance;
    }



    public void changePin(int currentPin, int newPin){

        if (currentPin == this.pin){
            this.pin = newPin;
        } else {
            System.out.println("Error. Please enter your old pin together with the desired new pin");
        }

    }


    public int getPin() {
        return pin;
    }

    public String getInternalNode() {
        return internalNode;
    }

    public String getOwner() {
        return owner;
    }
}
