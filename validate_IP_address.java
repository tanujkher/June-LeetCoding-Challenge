import java.util.ArrayList;

public class validate_IP_address {
    public static void main(String[] args) {
        System.out.println("Simple string manipulation problem");
    }
}

class an {
    public String validIPAddress(String IP) {
        for(int i = 0; i <= IP.length() - 1; i++){
            if(IP.charAt(i) == ':'){
                return check6(IP);
            }else if(IP.charAt(i) == '.'){
                return check4(IP);
            }
        }
        return "Neither";
    }
    private String check4(String IP){
        ArrayList<String> address = new ArrayList<>();
        String curr = "";
        if(IP.charAt(0) == '.' || IP.charAt(IP.length() - 1) == '.'){
            return "Neither";
        }
        for(int i = 0; i <= IP.length() - 1; i++){
            if(IP.charAt(i) != '.'){
                curr = curr + IP.charAt(i);
            }else{
                address.add(curr);
                curr = "";
            }
        }
        address.add(curr);
        if(address.size() != 4){
            return "Neither";
        }
        for(String val : address){
            for(int i = 0; i <= val.length() - 1; i++){
                if(!Character.isDigit(val.charAt(i))){
                    return "Neither";
                }
            }
            if(val.length() == 0){
                return "Neither";
            }else if(val.length() > 3){
                return "Neither";
            }else if(val.charAt(0) == '0' && val.length() != 1){
                return "Neither";
            }else if(Integer.parseInt(val) >= 256 || Integer.parseInt(val) < 0){
                return "Neither";
            }
        }
        return "IPv4";
    }
    private String check6(String IP){
        ArrayList<String> address = new ArrayList<>();
        String curr = "";
        if(IP.charAt(0) == ':' || IP.charAt(IP.length() - 1) == ':'){
            return "Neither";
        }
        for(int i = 0; i <= IP.length() - 1; i++){
            if(IP.charAt(i) != ':'){
                curr = curr + IP.charAt(i);
            }else{
                address.add(curr);
                curr = "";
            }
        }
        address.add(curr);
        if(address.size() != 8){
            return "Neither";
        }
        for(String val : address){
            for(int i = 0; i <= val.length() - 1; i++){
                if(!(Character.isDigit(val.charAt(i)) || Character.toLowerCase(val.charAt(i)) == 'a' || Character.toLowerCase(val.charAt(i)) == 'b' || Character.toLowerCase(val.charAt(i)) == 'c' || Character.toLowerCase(val.charAt(i)) == 'd' || Character.toLowerCase(val.charAt(i)) == 'e' || Character.toLowerCase(val.charAt(i)) == 'f')){
                    return "Neither"; 
                }
            }
            if(val.length() == 0){
                return "Neither";
            }else if(val.length() > 4){
                return "Neither";
            }
        }
        return "IPv6";
    }
}