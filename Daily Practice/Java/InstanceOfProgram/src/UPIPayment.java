public class UPIPayment implements Payment {

    public void pay(){
        System.out.println("UPI payment is being processed  ");
    }

    public Double ChargeMDR(){
        return 2.5;
    }
    
}
