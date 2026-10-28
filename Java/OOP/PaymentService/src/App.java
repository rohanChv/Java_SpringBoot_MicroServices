public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Transaction t=new Transaction(400,500,"Cash");
        Transaction t1=new Transaction(400,400,"Card");
        PaymentService paymentService=new PaymentService();
        t=paymentService.performPayment(t);
        t1=paymentService.performPayment(t1);

        System.out.println(t.toString());
        System.out.println(t1.toString());

        Transaction cardClone=(Transaction)t1.clone();
        System.out.println(cardClone.toString());
    }
}
