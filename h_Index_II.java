
public class h_Index_II {
    public static void main(String[] args) {
        System.out.println("Simple linear search solution");
    }
}

class o {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int index = 0;
        while(index < n && n - index > citations[index]){
            index++;
        }
        return n - index;
    }
}