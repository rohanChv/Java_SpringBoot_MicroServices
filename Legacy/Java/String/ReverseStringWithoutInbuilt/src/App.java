public class App {
    public static void main(String[] args) throws Exception {
        String s="Java is great";
        
        char[] charArray=s.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        String s2=new String(charArray);
        System.out.println(s2);
    }
}
