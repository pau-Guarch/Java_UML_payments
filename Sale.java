package Java_UML;


public class Sale {
    private int quantity;
    private float price;
    private payment paymentType;
    private float total;

    public Sale( int quantity, float price){
        // this.paymentType = payment;
        this.quantity = quantity;
        this.price = price;
        this.total = quantity*price;
    }

    public void setPayment(payment payment){
        this.paymentType = payment;
    }

    public void addProduct(float price, int quantity){
        this.total += price*quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public float getTotal() {
        return total;
    }

    public payment getPayment(){
        return this.paymentType;
    }
    
}


