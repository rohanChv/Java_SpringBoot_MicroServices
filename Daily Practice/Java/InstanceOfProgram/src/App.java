public class App {
    public static void main(String[] args) throws Exception {

        CashPayment cashPayment=new CashPayment();
        UPIPayment upi=new UPIPayment();
        PaymentService ser=new PaymentService();
        ser.processPaymnet(PaymentMethod.CASH, cashPayment);
        ser.processPaymnet(PaymentMethod.UPI, upi);
    }
}
