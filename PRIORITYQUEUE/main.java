package PRIORITYQUEUE;
import java.util.*;


public class main {

    public static void main(String[] args) {
        
        Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("A");
        queue.offer("E");
        queue.offer("F");

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
            
        }
    }
    
}
