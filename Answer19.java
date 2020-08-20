package CipherSchool;
import java.util.*;

public class Answer19 {
 
	static void reverseQueueFirstKElements(int k, Queue<Integer> queue) 
    { 
        if (queue.isEmpty() == true
            || k > queue.size()) 
            return; 
        if (k <= 0) 
            return; 
  
        Stack<Integer> stack = new Stack<Integer>(); 
  
        // Push the first K elements into a Stack 
        for (int i = 0; i < k; i++) { 
            stack.push(queue.peek()); 
            queue.remove(); 
        } 
  
        // Enqueue the contents of stack 
        // at the back of the queue 
        while (!stack.empty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
  
        // Remove the remaining elements and enqueue 
        // them at the end of the Queue 
        for (int i = 0; i < queue.size() - k; i++) { 
            queue.add(queue.peek()); 
            queue.remove(); 
        } 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> queue = new LinkedList<Integer>(); 
		     
		    queue.add(5); 
		    queue.add(4); 
		    queue.add(3); 
		    queue.add(2); 
		    queue.add(1); 
		    reverseQueueFirstKElements(2, queue);
		    for(Integer e : queue)
		    {
		    	System.out.println(e);
		    }
		

	}

}
