public enum PaymentMethod {
    UPI("UPI"),CASH("CASH"),Card("Card");
    
    String desc;
    private PaymentMethod(String Desc){
        this.desc=desc;
    }

    public String getDesc(){
        return this.desc;
    }
    
}
