import java.util.*;

public class reverse{

    public static void main(String[] args) {
        
        Stack<Character>stack = new Stack<Character>();

        String name = "shaunak";

        StringBuilder reverse = new StringBuilder();

        for (char x : name.toCharArray()) {

            stack.push(x);
            
        }

        while(!stack.isEmpty())
        {
            reverse.append(stack.pop());
        }

        System.out.println(reverse.toString());



    }
}