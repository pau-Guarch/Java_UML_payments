package Java_UML;

public abstract class payment implements IPayment{
    //pago es clase abstracta probablemente
    private float amountToPay;

    public payment(float amount){
        this.amountToPay = amount;
    }

    public double  getAmountToPay() {
        return Math.round(this.amountToPay * 100.0) / 100.0 ;
    }

    public void setAmountToPay(float amountPayed) {
        this.amountToPay = amountPayed;
    }

}
