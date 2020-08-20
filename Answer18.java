package CipherSchool;
import java.util.*;

public class Answer18 {
 
    static Queue<Integer> reverseQueue(Queue<Integer> q) 
    { 
         
        if (q.isEmpty()) 
            return q; 
      
        int data = q.peek(); 
        q.remove(); 
        q = reverseQueue(q);  
        q.add(data); 
              
        return q; 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> queue = new LinkedList<Integer>(); 
		     
		    queue.add(5); 
		    queue.add(4); 
		    queue.add(3); 
		    queue.add(2); 
		    queue.add(1); 
		    queue = reverseQueue(queue); 
		    for(Integer e : queue)
		    {
		    	System.out.println(e);
		    }
		

	}

}
