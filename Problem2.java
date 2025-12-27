package Tandemloop;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter series length: "); 
		int x = scan.nextInt();

		System.out.println("Enter starting value: "); 
		int num = scan.nextInt();
		
		for(int i=1;i<=x;i++) 
		{
			System.out.print(num+ " ");
			num= num+2;
		}
		
		scan.close();
	}

}
