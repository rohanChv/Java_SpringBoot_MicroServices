import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        String s="Java is Good";
        String s2=Arrays.stream(s.split("\\s+"))
        .map(e->{
            StringBuilder sb=new StringBuilder(e);
            return sb.reverse();
        })
        .collect(Collectors.joining(" "));
        System.out.println(s2);
    }
}
