package Java_UML;

import java.util.ArrayList;


public class NewSales {
    public static void main(String[] args) {

    ArrayList<Sale> arraySale = new ArrayList<Sale>();

    Sale s1  = new Sale(1, 23.88f);
    payment payment1 = new CashPayment(30, s1.getTotal());
    s1.setPayment(payment1);

     // pago en cash pvp = 1000, importe recibido = 1500
    
    Sale s2  = new Sale(2, 5.99f);
    CreditCardPayment payment2 = new CreditCardPayment("1232-2234-6544", 1234, s2.getTotal());
    payment2.Authorize("1232-2234-6544", 1234);
    s2.setPayment(payment2);
      // pago en credirCard card Number = 1234567 pvp = 3000
    
    Sale s3  = new Sale(3, 1.99f);
    payment payment3 = new CashPayment(10, s3.getTotal());
    s3.setPayment(payment3);
     // pago en cash pvp = 4400, importe recibido = 5300

    arraySale.add(s1);
    arraySale.add(s2);
    arraySale.add(s3);

   
    arraySale.stream().forEach((p)-> {  p.getPayment().DetailPayment();});
    }
}