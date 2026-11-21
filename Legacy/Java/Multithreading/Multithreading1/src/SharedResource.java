public class SharedResource{

    private int count=0;


    public void bakeCake() throws InterruptedException{
        synchronized(this){
            System.out.println("Cake is being baked by "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            incrementCake();
        }
    }

    public void incrementCake(){
        synchronized(this){
            // System.out.println("Cake is being baked by "+ Thread.currentThread().getName());
            System.out.println("stock is being incremented by "+ Thread.currentThread().getName());

        count++;
        }
    }


}