package String;

public class plaindrome{

    public static void main(String[] args) {
        
        String name="dad";

        StringBuilder reverse= new StringBuilder();

        for(int i=name.length()-1;i>=0 ;i--)
        {
            reverse.append(name.charAt(i));
        }

        System.out.println(reverse);

      if(reverse.toString().equals(name))
      {
        System.out.println("plaindrome");
      }
      else{
        System.out.println("not an palindrome");
      }


    }
}