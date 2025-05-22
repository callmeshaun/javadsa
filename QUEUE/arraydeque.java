package QUEUE;

import java.util.ArrayDeque;
import java.util.Queue;

public class arraydeque {
    
    public static void main(String args[]) {
    
    Queue <String> queue = new ArrayDeque<String>();

   //  System.out.println(queue.isEmpty());

    queue.offer("shaunak");
    queue.add("swaraj");

   //  System.out.println(queue.isEmpty());
   //   System.out.println(queue.size());
   //   System.out.println(queue.contains("shaunak"));

   //  System.out.println(queue.peek());
   // queue.poll();
   // queue.poll();
   // queue.remove();->throws exception

   // System.out.println(queue.element());-> throws exp

    System.out.println(queue);


   }
}
