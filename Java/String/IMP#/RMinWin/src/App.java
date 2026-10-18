import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String s="ADOBECODEBANC";
        String t="ABC";

        Map<Character,Integer> window=new HashMap<>();
        Map<Character,Integer> target=new HashMap<>();
        int right=0;
        int left=0;
        int minLen=Integer.MAX_VALUE;
        String min="";
        
        int found=0;
        for(char c: t.toCharArray()){
            target.put(c,target.getOrDefault(c, 0)+1);
        }
        int required=target.size();

        while(right<s.length()){

            char c=s.charAt(right);

            window.put(c,window.getOrDefault(c,0)+1);
            if(target.containsKey(c)){
                if(target.get(c).equals(window.get(c))){
                    found++;
                }
            }

            while(found==required && left<=right){
                char c1=s.charAt(left);

                if(minLen>(right-left+1)){
                    min=s.substring(left,right+1);
                    minLen=min.length();
                } 

                window.put(c1,window.getOrDefault(c1, 0)-1);
                if(target.containsKey(c1)){
                    if(target.get(c1)>window.get(c1)){
                        found--;
                    }
                }
                left++;
            }
            right++;

        }
        System.out.println(min);
        

    }
}
