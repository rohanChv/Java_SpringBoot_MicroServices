import java.math.BigDecimal;
import java.math.RoundingMode;

public class CashPayment implements Payment{

    public Transaction processPayment(Transaction t){
        BigDecimal bd=new BigDecimal(t.getBillAmount());
        bd.setScale(0,RoundingMode.UP);
        t.setAmountTobeReturned(t.getReceivedAmount()-bd.doubleValue());
        t.setServiceCharges(0.0);
        System.out.println("Processed Cash Payment");
        return t;

    }
    
}
