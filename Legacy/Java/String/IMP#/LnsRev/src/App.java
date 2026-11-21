import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String s="ABCDXABBYNCWE";
        String max="";

        HashSet<Character> set=new HashSet<>();


        int left=0;
        int right=0;
        while(right<s.length()){

            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            if(max.length()<(right-left+1)){
                max=s.substring(left,right+1);
            }
            right++;

        }
        System.out.print(max);

        String s2="Hello World I'm Eating Orange";
        List<Character>list=Arrays.asList('a','e','i','o','u');

        Arrays.stream(s2.split("\\s+"))
        .filter(e->list.contains(e.substring(0,1).toLowerCase().charAt(0)))
        .map(e->e.toUpperCase())
        .forEach(System.out::println);



    }
}
