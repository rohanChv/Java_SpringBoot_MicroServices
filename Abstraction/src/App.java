import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Shape square=new Square(3.0);
        square.displayInfo();

        int[] array={1,1,2,3,4,4,4,4,5,7,8,8,9,9,9,9,9,99,9,1};
        Arrays.stream(array)
        .distinct()
        .forEach(e->System.out.print(e+","));
    }
}
