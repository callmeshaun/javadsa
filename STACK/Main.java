import java.util.Stack;

public class Main{

    public static void main(String args[]){

        Stack<String>stack = new Stack<String>();

        // System.out.println(stack.empty());

        stack.push("shaunak");
        stack.push("swaraj");
        stack.push("mumma");

          
        
        //   stack.pop();
        //   stack.pop();
        //   stack.pop();
          
        // String family = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("mumma"));
        System.out.println(stack.search("shaunak"));
        //   System.out.println(family);



    }
}