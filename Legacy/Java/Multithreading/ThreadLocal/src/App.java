public class App {
    public static void main(String[] args) throws Exception {
    
        ThreadLocal<String>local=new ThreadLocal<>();

        Thread t1=new Thread(()->{

            local.set("Thread 1");
            System.out.print(local.get());
            local.remove();

        },"Thread 1");
        //   t1.setDaemon(true);
        t1.start();

    }
}
