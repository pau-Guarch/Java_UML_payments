package Java_UML;

import Java_UML.IPayment;

public class CreditCardPayment  extends payment {

    private String CardNumber;
    private int pinNumber;
    private boolean succesfulPayment;
    
    public CreditCardPayment(String CardNumber, int pinNumber, float total){
        super(total);
        this.CardNumber = CardNumber;
        this.pinNumber = pinNumber;
    }

    public void Authorize(String CardNumber, int EnteredPin){
        if (this.pinNumber==EnteredPin && this.CardNumber== CardNumber){
            this.succesfulPayment= true;
        }else{
            this.succesfulPayment= false;
        }
    }

    public void DetailPayment() {
        System.out.println("You payed a sale with the credit card ("+this.CardNumber+") for the amount of "+this.getAmountToPay()+" and the result was "+this.succesfulPayment);
        
    }
}
