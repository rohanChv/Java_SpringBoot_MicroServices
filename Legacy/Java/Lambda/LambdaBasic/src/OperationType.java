public enum OperationType{
    ADDITION("addition Operation") ,
    SUBTRACTION("Subtraction Operation") ,
    DIVISION("Division Operation") ,
    MULTIPLICATION("Multiplication Operation");

    private String operationType;
    private OperationType(String s){
        this.operationType=s;
    }

    public String getDescString(){

        return operationType;

    }

    

}