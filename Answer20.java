package CipherSchool;

public class Answer20 {
	class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
	}
	
        Node head;
        void printNthFromLast(int n) 
        { 
            int len = 0; 
            Node temp = head; 
            while (temp != null) { 
                temp = temp.next; 
                len++; 
            } 
      
            if (len < n) 
                return; 
      
            temp = head; 
            for (int i = 1; i < len - n + 1; i++) 
                temp = temp.next; 
      
            System.out.println(temp.data); 
        } 
        public void push(int new_data) 
        { 
        	if(head==null)
        	{
        		head=new Node(new_data);
        	}
            Node temp=head;
            while(temp.next!=null)
            	temp=temp.next;
            temp.next=new Node(new_data);
        }

	public static void main(String[] args) {
		Answer20 llist = new Answer20(); 
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(35); 
	  
	        llist.printNthFromLast(3); 

	}

}
