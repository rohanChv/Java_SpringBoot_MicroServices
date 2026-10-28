import java.util.HashMap;
import java.util.Map;

public class App {

    public static void minimumWinWindowSubstring(String s,String t){

    Map<Character,Integer>targetMap=new HashMap<>();
    Map<Character,Integer>window=new HashMap<>();

    for(char c:t.toCharArray()){
        targetMap.put(c,targetMap.getOrDefault(c,0)+1);
    }

    int left=0;
    int right=0;
    int found=0;
    int required=t.length();
    String minString="";
    int minLen=Integer.MAX_VALUE;
    
    while(right<s.length()){
        char c=s.charAt(right);

        window.put(c,window.getOrDefault(c, 0)+1);

        if(targetMap.containsKey(c)){
            if(targetMap.get(c).equals(window.get(c))){
            found++;
            }
        }

        while(found==required && left<=right){

            if(right-left+1<minLen){
                minString=s.substring(left,right+1);
                minLen=minString.length();
            }
            char leftChar=s.charAt(left);
            window.put(leftChar,window.get(leftChar)-1);
            if(targetMap.containsKey(leftChar)&&window.get(leftChar)<targetMap.get(leftChar)){
                found--;
            }
            left++;
        }
        right++;
    }
    System.out.println(minString);


    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        minimumWinWindowSubstring("ADOBECODEBANC","ABC");
    }
}
