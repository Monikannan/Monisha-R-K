package Tandemloop;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter A value: "); 
		double a = scan.nextDouble();

		System.out.println("Enter B value: "); 
		double b = scan.nextDouble();

		System.out.println("Type of operation(add,sub,mul,div): "); 
		String op=scan.next();
		
		switch (op.toLowerCase()) 
		{
        case "add":
            System.out.println(a + b);
            break;

        case "sub":
        	System.out.println(a - b);
        	break;

        case "mul":
        	System.out.println(a * b);
        	break;

        case "div":
            if (b != 0)
            	System.out.println(a / b);
            	
            else 
                System.out.println("Cannot divide by zero");
            break;
            
        default:
            System.out.println("Invalid Operation");           
            
        }
		scan.close();
		
	}

}
