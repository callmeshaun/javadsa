package LINKEDLIST;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        // LL as stack
        // linkedList.push("shaunak");
        // linkedList.push("swaraj");
        // linkedList.pop();

        //LL as queue
        linkedList.offer("shaun");
        linkedList.offer("swaraj");
        // linkedList.poll();
        linkedList.add(1, "mom");
        linkedList.remove("swaraj");

        System.out.println(linkedList.indexOf("mom"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("dad");
        linkedList.addLast("swaraj");

        // linkedList.removeFirst();
        // linkedList.removeLast();

        linkedList.pollFirst();
        linkedList.pollLast();

        System.out.println(linkedList);
    }
    
}
