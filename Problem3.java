package Tandemloop;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter iteration: ");
		int x = scan.nextInt();
        int limit;

        switch (x % 2) {
            case 0:
                limit = x - 1;
                break;
            default:
                limit = x;
        }

        int num = 1;
        for (int i = 1; i <= limit; i++) {
            System.out.print(num + " ");
            num += 2;
        }

    scan.close();
	}

}
