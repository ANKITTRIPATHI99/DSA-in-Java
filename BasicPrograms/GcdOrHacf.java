package BasicPrograms;

import java.util.Scanner;

public class GcdOrHacf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();


        System.out.println(gcd(a, b));


        
    }

    
	public static int gcd(int a,int b)
	{
		// Write your code here
		int hcf=1;
		for(int i=1; i<=Math.min(a,b); i++)
			if(a%i == 0 && b%i ==0)
				hcf = i;
	
					return hcf;
				
	
	}	
    
}
