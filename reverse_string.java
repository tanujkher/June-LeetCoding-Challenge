
public class reverse_string {
    public static void main(String[] args) {
        System.out.println("Simple two pointer swapping");
    }
}
class S {
    public void reverseString(char[] s) {
        int lo = 0;
        int hi = s.length - 1;
        while(lo <= hi){
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
    }
}