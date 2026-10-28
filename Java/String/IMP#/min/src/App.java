import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String s="ADOBECODEBANC";
        String t="ABC";

        Map<Character,Integer> target=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();

        for(char c: t.toCharArray()){
            target.put(c,target.getOrDefault(c, 0)+1);
        }
        
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int found=0;
        int required=target.size();
        String minString="";

        while(right<s.length()){

            char c=s.charAt(right);

            window.put(c, window.getOrDefault(c, 0)+1);

            if(target.containsKey(c)){
                if(target.get(c).equals(window.get(c))){
                    found++;
                }
            }

            while(found==required && left<=right){
                char c1=s.charAt(left);
                if(min>(right-left+1)){
                    min=right-left+1;
                    minString=s.substring(left,right+1);
                }
                window.put(c1, window.getOrDefault(c1,0)-1);
                if(target.containsKey(c1)){
                    if(target.get(c1)>window.get(c1)){
                        found--;
                    }
                }
                left++;
            }
            right++;
        }
        System.out.println(minString);

       
    }
}