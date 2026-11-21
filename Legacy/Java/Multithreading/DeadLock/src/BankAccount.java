public class BankAccount {

    private int Id;
    private Double amount;

    BankAccount(int id,Double amount){
        this.Id=id;
        this.amount=amount;
    }

    public void deposit(Double creditAmount) throws InterruptedException{
        amount+=creditAmount;
        Thread.sleep(1000);
    }

    public void withdraw(Double debitAmount) throws InterruptedException{
        if(amount<debitAmount){
            throw new LowBalanceExeption("Insufficient Balance ");
        }
        else
            amount-=debitAmount;
        Thread.sleep(1000);
    }

    public void processTransactions(BankAccount from,BankAccount to,Double amount) throws InterruptedException{
        System.out.println("Processing "+Thread.currentThread().getName());
        synchronized(from){
            from.withdraw(amount);

            synchronized(to){
                to.deposit(amount);
            }

        }
        System.out.println("Processing Completed for "+Thread.currentThread().getName());

    }
    
}
