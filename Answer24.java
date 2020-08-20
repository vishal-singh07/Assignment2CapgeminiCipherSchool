package CipherSchool;
import java.util.*;
public class Answer24 {
	static int kthsmallest(int arr[],int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter size");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("ENter array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter k");
		int K=sc.nextInt();
		System.out.println(kthsmallest(array,K));
	}

}
