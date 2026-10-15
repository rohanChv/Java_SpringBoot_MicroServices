import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {

    public static void minimumWindowSubString(String s,String t){

        Map<Character,Integer>target=new HashMap<>();
                Map<Character,Integer>window=new HashMap<>();

        for(char c:t.toCharArray()){
            target.put(c,target.getOrDefault(c,0)+1);
        }
        int left=0;
        int right=0;
        int maxLen=0;
        String maxString="";
        ///ADOBECODEBANC ABC
        int found=0;
        int required=target.size();
        while(right<s.length()){

            char c=s.charAt(right);
            window.put(c, window.getOrDefault(c,0)+1);

            if(target.containsKey(c)){

                if(target.get(c).equals(window.get(c))){
                    found++;
                }
                if(found==required && left<=right){
                    char leftChar=s.charAt(left);
                    window.put(leftChar,window.getOrDefault(leftChar,0)+1);

                    if(target.containsKey(leftChar)&&window.get(leftChar)<target.get(leftChar)){
                        found--;
                    }
                    left++;     
                }

            }
            right++;

        }

    }




    public static void main(String[] args) throws Exception {
        String s="ABCDABABXYZWD";
        String maxString="";
        int right=0;
        int left=0;

        HashSet<Character> set=new HashSet<>();

        for(char c:s.toCharArray()){

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            if(maxString.length()<right-left+1){
                maxString=s.substring(left,right+1);
            }
            right++;
            
        }
        System.out.print(maxString);


    }
}
