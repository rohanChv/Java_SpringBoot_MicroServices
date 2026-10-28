import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

    public static void LongestSubStringWithoutRepeatingCharacters(String s){
        //ABCDBAXYZW

        Set<Character> window=new HashSet<>();

        int right=0;
        int left=0;
        String maxString="";

        while(right<s.length()){

            char c=s.charAt(right);

            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            if(right-left+1>maxString.length()){
                    maxString=s.substring(left,right+1);
            }
            right++;
        }

    
        System.out.println("Result is being calculated by : "+Thread.currentThread().getName()+" "+maxString);

    }

    public static void minimumWindow(String s,String t){

        Map<Character,Integer> target=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();
        int right=0;
        int left=0;
        int minLen=Integer.MAX_VALUE;
        String minString="";
        int found=0;
        for(char c: t.toCharArray()){
            target.put(c, target.getOrDefault(c, 0)+1);
        }
        int required=target.size();

        while(right<s.length()){

            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c, 0)+1);

            if(target.containsKey(c)){
                if(target.get(c).equals(window.get(c))){
                    found++;
                }
            }

            while(found==required && left<=right){

                char c1=s.charAt(left);

                if(right-left+1<minLen){
                    minString=s.substring(left,right+1);
                    minLen=minString.length();
                }

                window.put(c1,window.get(c1)-1);

                if(target.containsKey(c1)){
                    if(target.get(c1)>window.get(c1)){
                        found--;
                    }
                }
                left++;

            }
            right++;

        }
        System.out.println("Result is being calculated by : "+Thread.currentThread().getName()+" "+minString);

        

    }

    public static String expandWithin(String s,int left,int right){

        while(left>=0 && right<s.length()&&(s.charAt(right)==s.charAt(left))){
            left--;
            right++;
        }
        return s.substring(left+1,right);

    }

    public static void longestPallindromicSubString(String s){

        String maxString="";
        int maxLen=Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){

            String s1=expandWithin(s,i, i);
            String s2=expandWithin(s,i, i+1);

            s2=(s1.length()>s2.length())?s1:s2;

            if(maxLen<s2.length()){
                maxString=s2;
                maxLen=maxString.length();
            }

        }
        System.out.println(maxString);

    }



    public static void main(String[] args) throws Exception {
    long currentime=System.currentTimeMillis();
       Thread t1=new Thread(()->LongestSubStringWithoutRepeatingCharacters("ABCDBAXYZW"),"THREAD 1");
       t1.start();
       Thread t2=new Thread(()->minimumWindow("ADOBECODEBANC","ABC"),"THREAD 2");
       t2.start();

       longestPallindromicSubString("RACECART");
    
    // LongestSubStringWithoutRepeatingCharacters("ABCDBAXYZW");
    // minimumWindow("ADOBECODEBANC","ABC");



    long time2=System.currentTimeMillis();

    System.out.println((time2-currentime));
    }
}
