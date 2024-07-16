package Vector;

import java.util.Stack;

public class Test {
   public static void main(String[] args) {
	Stack s = new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	
	System.out.println("Total element present in stack :"+s);
	System.out.println("Pop operation :"+s.pop());
	System.out.println("Total element present in stack after doing POP operation :"+s);
	System.out.println("performing peek operation  :"+s.peek()); //which checks the top most value of stack and showing in output
	System.out.println("Total element present in stack after doing POP operation :"+s);
	System.out.println(s.isEmpty());
	System.out.println(s);
	System.out.println(s.size());
	
   }
}
