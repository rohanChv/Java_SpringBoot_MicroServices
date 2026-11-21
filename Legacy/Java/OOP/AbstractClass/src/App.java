public class App {

    public static String expand(String s,int left,int right){
        
        while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
            left--;
            right++;
        }
        return s.substring(left+1,right);

    }

    public static void main(String[] args) throws Exception {
        String s="ABCDDCBT";
        int maxLen=Integer.MIN_VALUE;
        String maxString="";

        for(int i=0;i<s.length();i++){

            String s1=expand(s,i, i);
            String s2=expand(s,i, i+1);

            String s3=s1.length()>s2.length()?s1:s2;

            if(maxLen<s3.length()){
                maxString=s3;
                maxLen=s3.length();
            }
        }
        System.out.print(maxString);
    }
}
