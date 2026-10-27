public class App {
    public static void main(String[] args) throws Exception {
        SharedResource sr=new SharedResource();

        Thread t1=new Thread(()->{
            try {
                sr.bakeCake();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        },"First Thread");

        Thread t2=new Thread(()->sr.incrementCake(),"Second Thread");

        System.out.println(t1.getName()+" "+t1.getPriority()+"  "+t1.getState());
        System.out.println(t2.getName()+" "+t2.getPriority()+"  "+t2.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getName()+" "+t1.getPriority()+"  "+t1.getState());
        System.out.println(t2.getName()+" "+t2.getPriority()+"  "+t2.getState());


    }
}
