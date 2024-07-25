  import java.util.Stack;
  
  public class Main {
      public static void main(String[] args) {
          Stack<Integer> rhs = new Stack<>();  // Declare a stack of integers
  
          int c = 42;  // Some value to push onto the stack
  
          rhs.push(c);  // Push c onto the stack
  
          // Print the top element of the stack (should be 42)
          System.out.println("Top element of stack: " + rhs.peek());
      }
  }
  