package Java_UML;

public class CashPayment extends payment{

    private float amountTendered;
    private boolean successfulPayment;

    public CashPayment(float amountTendered, float total){
        super(total);
        this.amountTendered=amountTendered;    
    }

    public double calcChange(){
        if (this.amountTendered>super.getAmountToPay()){
            this.successfulPayment=true;
            double result = Math.round((this.amountTendered-super.getAmountToPay()) * 100.0) / 100.0;
            return result;
            
        }else{
            this.successfulPayment=false;
            return this.amountTendered-super.getAmountToPay();
        }
    }

    @Override
    public void DetailPayment() {
        // TODO Auto-generated method stub"
        System.out.println("You gave "+this.amountTendered+" euros and the total amount is "+super.getAmountToPay()+" euros. Your change is "+this.calcChange());
    }
}
