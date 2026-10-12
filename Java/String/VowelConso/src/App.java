import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        String s="Hello World I am best";
        Set<Character> set= new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        Map<String,Long>map=s.chars()
        .mapToObj(e->(char)e)
        .collect(Collectors.groupingBy((e->{
            String s1=set.contains(e)?"Vowel":"Consolant";
            return s1;
        }),Collectors.counting()));

        System.out.println(map);

        Map<String,List<Character>> map1=s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e->{

            if(Character.isUpperCase(e)){
                return "UpperCase";
            }
            if(Character.isLowerCase(e)){
                return "LowerCase";
            }
            if(Character.isWhitespace(e)){
                return "WhiteSpace";
            }
            else
                return "Other";
        },Collectors.toList()));

        System.out.println(map1);
        String res=s.replace(" ","%20");
        System.out.println(res);

        char[] array=s.toCharArray();

        for(int i=0;i<array.length;i++){
          if(array[i]>='a' && array[i]<='z'){
            array[i]-=32;
          }  
        }
        String s5=new String(array);
        System.out.println(s5);

        array=s5.toCharArray();

        for(int i=0;i<array.length;i++){
          if(array[i]>='A' && array[i]<='Z'){
            array[i]+=32;
          }  
        }

        String s6=new String(array);
        System.out.println(s6);  
    }
}
