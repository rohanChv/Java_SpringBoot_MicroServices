public class PaymentService {

    public void processPaymnet(PaymentMethod pay,Payment payment){
        
        switch (pay) {
            case PaymentMethod.UPI:
                Double a=0.0;
                if(payment instanceof UPIPayment){
                    UPIPayment paym=(UPIPayment)payment;
                    a=paym.ChargeMDR();
                }
                System.out.println(" MDR is " + a +" processing upi");
                payment.pay();
                break;
            
            case PaymentMethod.CASH:
                payment.pay();
                break;
        
            default:
                break;
        }

    }
    
}
