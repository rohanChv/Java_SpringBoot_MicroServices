

public class LowBalanceExeption extends RuntimeException {

    LowBalanceExeption(){
        super();
    }

    LowBalanceExeption(String message){
        super(message);
    }
    
    
}
