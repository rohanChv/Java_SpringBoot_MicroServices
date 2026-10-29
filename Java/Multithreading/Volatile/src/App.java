import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    private static boolean flag=false;
    public static void main(String[] args) throws Exception {
    
    Thread t1=new Thread(()->{

        for(int i=0;i<5000;i++){
            System.out.println("Incrementing i"+i);
        }
        flag=true;

    },"Thread 1");

    Thread t2=new Thread(()->{
        int i=0;

        while(!flag){
        i++;
        }
        System.out.println("I =>"+i);

    },"Customer Waiting Threading");

    t1.start();
    t2.start();
    }
}
