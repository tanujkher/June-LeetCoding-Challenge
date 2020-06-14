import java.util.ArrayList;
import java.util.HashMap;

public class cheapest_flights_within_K_stops {
    public static void main(String[] args) {
        System.out.println("Difficult question involving graph, bfs, and dynamic programming");
    }
}

class St {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Graph g = new Graph(n);
        g.makeGraph(flights);
        // g.displayGraph();
        return g.minCost(src, dst, K);
    }
}

class Graph{
    int[][] matrix;
    
    public Graph(int v){
        matrix = new int[v][v];
    }
    
    public int minCost(int u, int v, int K){
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        int ans = minCost(u, v, visited, K + 1, map);
        return (ans == 10000000 ? -1 : ans);
    }
    
    private int minCost(int u, int v, HashMap<Integer, Integer> visited, int K, HashMap<ArrayList<Integer>, Integer> map){
        if(u == v && K >= 0){
            return 0;
        }
        if(K < 0){
            return 10000000;
        }
        ArrayList<Integer> curr = new ArrayList<>();
        curr.add(u);
        curr.add(v);
        curr.add(K);
        if(map.containsKey(curr)){
            return map.get(curr);
        }
        int min = 10000000;
        for(int i = 0; i <= matrix.length - 1; i++){
            if(containsEdge(u, i) && !visited.containsKey(i)){
                visited.put(i, 1);
                min = Math.min(minCost(i, v, visited, K - 1, map) + matrix[u][i], min);
                visited.remove(i);
            }
        }
        map.put(curr, min);
        return min;
    }
    public void makeGraph(int[][] flights){
        for(int i = 0; i <= flights.length - 1; i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int cost = flights[i][2];
            matrix[u][v] = cost;
            // matrix[v][u] = cost;
        }
    }
    public void displayGraph(){
        for(int[] val : matrix){
            for(int v : val){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
    public boolean containsEdge(int u, int v){
        return matrix[u][v] != 0;
    }
}