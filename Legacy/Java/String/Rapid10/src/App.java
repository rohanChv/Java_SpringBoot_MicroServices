import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {






    public static void reverseWithoutInbuiltFuncion(String s){

        char[] array=s.toCharArray();

        int start=0;
        int end=array.length-1;

        while(start<end){
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }

        String s1=new String(array);
        System.out.println(s1);

    }

    public static void reverseEachWordInSentence(String s){
        String s1=Arrays.stream(s.split("\\s+"))
        .map(e->{
            StringBuilder sb=new StringBuilder(e);
            return sb.reverse();
        }).collect(Collectors.joining(" "));

        System.out.println(s1);
        System.out.println("Complexity -> Time O(N) Space O(N+M)");
        
    }

    public static void reverseOrderOfEachWord(String s){

        List<String> list=Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        String s2=list.stream()
        .collect(Collectors.joining(" "));
        System.out.println(s2);

    }

    public static void isPallindrome(String s){

        char[] array=s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while(left<=right){
            if(array[left]!=array[right]){
                System.out.println("Its not a pallindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Its a pallindrome");
    }




    public static void main(String[] args) throws Exception {
        reverseWithoutInbuiltFuncion("Hello World");
        reverseEachWordInSentence("Hello World its bad");
        reverseOrderOfEachWord("Hello Programming is Quite Good");
        isPallindrome("malayalam");
    }
}
