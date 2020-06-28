import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class reconstruct_itinerary {
    public static void main(String[] args) {
        System.out.println("Priority queue and graph based solution");
    }
}

class to {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> flights = new HashMap<>();
		// build graph 
        for (List<String> ticket : tickets) {
            flights.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            flights.get(ticket.get(0)).add(ticket.get(1));
        }

        LinkedList<String> path = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.empty()) {
            while (flights.containsKey(stack.peek()) && !flights.get(stack.peek()).isEmpty())
                stack.push(flights.get(stack.peek()).poll());
			path.addFirst(stack.pop());
        }
        
        return path;
    }
}