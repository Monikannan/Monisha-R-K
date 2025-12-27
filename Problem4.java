package Tandemloop;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        int[] count = new int[10];

        for (int i = 1; i <= 9; i++) 
        {
            for (int j = 0; j < arr.length; j++) 
            {
                if (arr[j] % i == 0) 
                {
                    count[i]++;
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) 
        {
            System.out.print(i + ": " + count[i]);
            if (i < 9) 
            	System.out.print(", ");
        }
        System.out.print("}");

	}

}
