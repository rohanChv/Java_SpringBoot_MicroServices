import java.math.BigDecimal;
import java.math.RoundingMode;

public class CardPayment implements Payment{

    public Transaction processPayment(Transaction t){
        BigDecimal bd=new BigDecimal(t.getBillAmount());
        bd.setScale(0,RoundingMode.UP);
        BigDecimal bd1=new BigDecimal(0.25/100);
        t.setServiceCharges(bd.multiply(bd1).doubleValue());
        System.out.println("Processed card Payment");
        return t;
    }

    public void printSlip(){
        System.out.println("Printed the Slip for Card payment ");
    }
    
}
