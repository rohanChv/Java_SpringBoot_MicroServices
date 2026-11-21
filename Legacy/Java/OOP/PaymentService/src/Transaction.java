public class Transaction implements Cloneable{

    private double billAmount;
    private double receivedAmount;
    private double amountToBeReturned;
    private String paymentMode;
    private double serviceCharges;
    private double taxPercentage;
    private double taxAmount;

    Transaction(double billAmount,double receivedAmount,String paymentMode){
        this.billAmount=billAmount;
        this.receivedAmount=receivedAmount;
        this.paymentMode=paymentMode;
    }

        // Getter for billAmount
    public double getBillAmount() {
        return billAmount;
    }

    public double getAmountToBeReturned() {
        return amountToBeReturned;
    }

    // Setter for billAmount
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public void setAmountTobeReturned(double billAmount) {
        this.amountToBeReturned = billAmount;
    }

    // Getter for receivedAmount
    public double getReceivedAmount() {
        return receivedAmount;
    }

    // Setter for receivedAmount
    public void setReceivedAmount(double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    // Getter for paymentMode
    public String getPaymentMode() {
        return paymentMode;
    }

    // Setter for paymentMode
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    // Getter for serviceCharges
    public double getServiceCharges() {
        return serviceCharges;
    }

    // Setter for serviceCharges
    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    // Getter for taxPercentage
    public double getTaxPercentage() {
        return taxPercentage;
    }

    // Setter for taxPercentage
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    // Getter for taxAmount
    public double getTaxAmount() {
        return taxAmount;
    }

    // Setter for taxAmount
    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "billAmount=" + billAmount +
                ", receivedAmount=" + receivedAmount +
                ", amountToBeReturned=" + amountToBeReturned +
                ", paymentMode='" + paymentMode + '\'' +
                ", serviceCharges=" + serviceCharges +
                ", taxPercentage=" + taxPercentage +
                ", taxAmount=" + taxAmount +
                '}';
    }

    @Override 
    public Object clone(){
        try {
            Object o=null; 
            o=super.clone();
            return o;
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


}