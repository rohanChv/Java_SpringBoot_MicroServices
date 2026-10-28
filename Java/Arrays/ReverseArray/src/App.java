import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader; 
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;     

public class App {
    public static void main(String[] args) throws Exception {
        String path="E:\\Java_SpringBoot_MicroServices\\StringQuestions.txt";
        try(BufferedReader reader=new BufferedReader(new FileReader(path))){
            String s=reader.readLine();
            while(s!=null){
                System.out.println(s);
                s=reader.readLine();
            }

        }catch(IOException e){
            System.out.println("IO Exception Catched by block "+e.getMessage());
        }

        
    String maxString="";

    String s1="Hello Java is good for Programming, so many organizations still preffer it";
    
    
    Arrays.stream(s1.split("\\s+"))
    .max(Comparator.comparingInt(String::length))
    .ifPresent(System.out::println);

    Arrays.stream(s1.split("\\s+"))
    .sorted((a,b)->b.length()-a.length())
    .skip(1).findFirst().ifPresent(System.out::println);

    String s3="Blue Bird is not so Blue Bird cannot be a Blue z";

    Arrays.stream(s3.split("\\s+"))
    .collect(Collectors.groupingBy(s->s,Collectors.counting()))
    .entrySet()
    .stream()
    .max(Map.Entry.comparingByValue())
    .ifPresent(e->System.out.println(e.getKey()));

        s3.chars()
        .mapToObj(e->(char)e)
        .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e->e.getValue()==1)
        .findFirst()
        .ifPresent(System.out::println);

        Set<Character> set=s3.chars()
        .mapToObj(e->(char)e)
        .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e->e.getValue()>1)
        .map(e->e.getKey())
        .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(set);

        String s4="PANAM";

        StringBuilder sb=new StringBuilder();

        IntStream.range(0,s4.length())
        .mapToObj(i->sb.append(s4.charAt(s4.length()-i-1)))
        .collect(Collectors.joining());

        System.out.println(sb);

        String s5="aaabbcccc";
        StringBuilder sb1=new StringBuilder();

        s5.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .map(e->String.valueOf(e.getKey())+String.valueOf(e.getValue()))
        .forEach(s->sb1.append(s));


        
        System.out.println(sb1);
    }

}
