package BasicPrograms;

import java.util.Scanner;

public class CheckforPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
    }

    public static boolean isPrime(int num) {
		//Your code goes here
	
        if(num<=1){
			return false;
		}

		for(int i=2; i<num; i++){
			if(num % i == 0)
			 return false;
		}
		

		return true;
	}
    
}
