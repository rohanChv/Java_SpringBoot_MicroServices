public class App {
    public static void main(String[] args) throws Exception {
       BankAccount hdfc=new BankAccount(123, 40000.00);
       BankAccount axis=new BankAccount(12345, 40000.00);

       Thread t1=new Thread(()->{
        try {
            hdfc.processTransactions(hdfc, axis, 1000.00);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    },"Transaction 1");

    Thread t2=new Thread(()->{
        try {
            axis.processTransactions(axis, hdfc, 1000.00);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    },"Transaction 2");

    t1.start();
    t2.start();
    }
}
