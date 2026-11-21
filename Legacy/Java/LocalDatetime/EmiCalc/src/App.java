import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {

        BigDecimal db=new BigDecimal(169900.67);
        db=db.setScale(2,RoundingMode.UP);

        LocalDate purchaseDate=LocalDate.now();
        LocalDate nextDate=purchaseDate.plus(1,ChronoUnit.MONTHS);
        System.out.println(nextDate);

        BigDecimal amountPerInstallment=db.divide(new BigDecimal(3));
        amountPerInstallment=amountPerInstallment.setScale(2,RoundingMode.UP);

        LocalDate startDate=purchaseDate;
        LocalDate endDate=purchaseDate;
        BigDecimal pendingAmount=db;

        // create simpleEmi
        for(int i=0;i<3;i++){
            endDate=startDate.plus(30,ChronoUnit.DAYS);
            pendingAmount=pendingAmount.subtract(amountPerInstallment).setScale(2,RoundingMode.UP);
            System.out.println(startDate +" - "+ endDate +" "+ "\nInstallment ="+ amountPerInstallment +" \nPendingAmount ="+ pendingAmount+"\n");
            startDate=endDate.plus(1,ChronoUnit.DAYS);
            

            System.out.println("----X----X----X----X----X----X----X----X----X----X----X----X----");

            System.out.print(Day.MONDAY);
            
        }


    
    }
}
