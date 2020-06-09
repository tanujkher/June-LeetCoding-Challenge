
public class is_subsequence {
    public static void main(String[] args) {
        System.out.println("Simply check for equal character at first place if equal use recursion for bot strings shortened by one length from begin and if s length becomes zero return true if t becomes zero return false");
    }
}

class Si {
    public boolean isSubsequence(String s, String t) {
        return isSs(s, t);
    }
    private boolean isSs(String s, String t){
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        char chs = s.charAt(0);
        char cht = t.charAt(0);
        String ros = s.substring(1);
        String rot = t.substring(1);
        boolean ans = false;
        if(chs == cht){
            ans = ans || isSs(ros, rot);
        }else{
            ans = ans || isSs(s, rot);
        }
        return ans;
    }
}