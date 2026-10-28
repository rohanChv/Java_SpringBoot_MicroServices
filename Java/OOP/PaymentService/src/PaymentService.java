public class PaymentService {

    public Transaction performPayment(Transaction t){

        switch (t.getPaymentMode()) {
            case "Cash":
                Payment cash=new CashPayment();
                t=cash.processPayment(t);
                printSlip(cash, "Cash Payment");
                break;
            case "Card":
                Payment card=new CardPayment();
                t=card.processPayment(t);
                printSlip(card,"Card Payment");  
                break;
        }
        return t;
    }
    private void printSlip(Payment p,String mode){
        if(p instanceof CardPayment){
           CardPayment card=(CardPayment)p;
           card.printSlip();
        }
        else
            System.out.println("Slip is not needed for "+ mode);
    }
    
}
