import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        String s="Hello World, programming is quiet Good";



        Map<Character,Long> map=s.chars()
                                .mapToObj(c->(char)c)
                                .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
        
        //first non-repeated character
        map.entrySet().stream()
        .filter(e->e.getValue()==1)
        .findFirst()
        .ifPresent(System.out::println);

        //first repeating character
        map.entrySet().stream()
        .filter(e->e.getValue()>1)
        .findFirst()
        .ifPresent(System.out::println);

        map.entrySet().stream()
        .forEach(System.out::println);

        System.out.print("HELLO =>");
        map.entrySet().stream()
        .sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
        .skip(5)
        .findFirst()
        .ifPresent(System.out::println);


        String s1="remove the duplicates while preserving insertion order";
        LinkedHashSet<Character> s2=s1.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(s2.stream().map(String::valueOf).collect(Collectors.joining("")));

        String s3="Halka Halka Suroor Hai";

        System.out.println(Arrays.stream(s3.split("\\s+"))
        .collect(Collectors.toCollection(LinkedHashSet::new))
        .stream()
        .collect(Collectors.joining(" ")));

        System.out.println(Arrays.stream(s3.split("\\s+"))
        .collect(Collectors.toCollection(LinkedHashSet::new))
        .stream()
        .collect(Collectors.counting()));

        System.out.println("UPDATED-> "+Arrays.stream(s1.split("\\s+"))
        .map(e->{
            return (e.substring(0,1).toUpperCase()+e.substring(1));
        })
        .collect(Collectors.joining(" ")));



    }
}
