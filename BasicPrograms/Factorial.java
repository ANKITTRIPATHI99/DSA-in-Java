package BasicPrograms;
import java.util.*;
public class Factorial {

    //By Using Recursion - optimal way - TC - O(n) - S.c.(n)

    public static int fact(int n){
    //    int res =0;
    //    if(n<=1){
    //        return 1;
    //    } 
    //    else{
    //        res = n*fact(n-1);
    //    }
    //    return res;

    // Brute force - t.c- O(n) - scO(1)

    int fact =1;
    for(int i=1; i<=n; i++){

        fact = fact * i;

    }
    return fact;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}
}


    

