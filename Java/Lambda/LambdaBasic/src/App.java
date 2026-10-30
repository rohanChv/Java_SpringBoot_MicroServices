public class App {
    public static void main(String[] args) throws Exception {

        ThreadLocal<String> local=new ThreadLocal<>();

        Operation1 addition=(int a,int b,OperationType type)->{

            local.set(type.getDescString());
            System.out.println(local.get()+" = "+(a+b));
        };
        Operation1 multiplication=(int a,int b,OperationType type)->{
            local.set(type.getDescString());
            System.out.println(a*b);
        };
        Operation1 division=(int a,int b,OperationType type)->{
            local.set(type.getDescString());
            System.out.println(a/b);};
        Operation1 subtraction=(int a,int b,OperationType type)->System.out.println(a-b);

        Thread t1=new Thread(()->{

            addition.performOperation(5, 5, OperationType.ADDITION);

        }," Thread 1");

        t1.start();


    
    }
}
