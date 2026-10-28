import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String s="ABCDAABXYZW";
        int right=0;
        int left=0;
        Set<Character> window=new HashSet<>();
        String maxString="";
        while(right<s.length()){
            char c=s.charAt(right);
            while(window.contains(c)){
                char c1=s.charAt(left);
                window.remove(c1);
                left++;
            }
            window.add(c);
            if(maxString.length()<(right-left+1)){
                maxString=s.substring(left,right+1);
            }
            right++;
        }
        System.out.println(maxString);

    }
}
