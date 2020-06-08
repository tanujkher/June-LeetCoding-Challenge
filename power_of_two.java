
public class power_of_two {
    public static void main(String[] args) {
        System.out.println("Special case of 0 false else keep dividing by 2 check if remainder == 0 at each step else return false and make n smaller by n / 2 each time");
    }
}

class Sion {
    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        while(n != 1){
            if(n % 2 != 0){
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}