import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        String s="Java is Very good";
        List<String> list=Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        String s2=String.join(" ",list);
        System.out.println(s2);

        String s3="Java is worth the time";
        List<String> l1=Arrays.asList(s3.split("\\s+"));
        Collections.reverse(l1);
        s3=l1.stream()
        .collect(Collectors.joining(" "));
        System.out.println(s3);

    }
}
