public class App {
    static boolean isPallindrome(String s){

        int left=0;
        int right=s.length()-1;
        while(left<right){

            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) throws Exception {
        String s="malayalam";
        System.out.println("malayalam is pallindome " + isPallindrome(s));
        
    }
}
