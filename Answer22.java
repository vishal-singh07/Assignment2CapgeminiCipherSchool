package CipherSchool;
import java.util.*;
public class Answer22 {
	static void changeArr(int[] input) 
    { 
        
        int newArray[] 
            = Arrays 
                  .copyOfRange(input, 
                               0, 
                               input.length); 
  
        
        Arrays.sort(newArray); 
        int i; 
        
        Map<Integer, Integer> ranks 
            = new HashMap<>(); 
  
        int rank = 1; 
  
        for (int index = 0; 
             index < newArray.length; 
             index++) { 
  
            int element = newArray[index]; 
  
           
            if (ranks.get(element) == null) { 
  
                ranks.put(element, rank); 
                rank++; 
            } 
        } 
        for (int index = 0; 
             index < input.length; 
             index++) { 
  
            int element = input[index]; 
            input[index] 
                = ranks.get(input[index]); 
         
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter size of input array");
		int n= sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		changeArr(array);
		System.out.println("required array is\n ");
		for(int e : array)
		{
			System.out.print(e+" ");
		}

	}

}
