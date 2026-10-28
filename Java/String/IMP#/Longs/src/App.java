import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        String s="ABCDABAXYZW";
        String max="";
        int left=0;
        int right=0;
        HashSet<Character> window=new HashSet<>();

        while(right<s.length()){
            char c=s.charAt(right);
            
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            if(max.length()<right-left+1){
                max=s.substring(left,right+1);
            }
            right++;
        }

        

        System.out.println(max);
    }
}
